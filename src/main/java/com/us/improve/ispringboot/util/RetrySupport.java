package com.us.improve.ispringboot.util;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.TimeUnit;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-07-16 17:36
 * @Version 1.0
 **/
public class RetrySupport {

	public static <T> T getRetryProxy(T target) {
		RetryProxy retryProxy = new RetryProxy(target);
		return (T) retryProxy.getProxy();
	}

	public static <T> T getRetryProxy(T target, int retryTimes, int retryInterval) {
		RetryProxy retryProxy = new RetryProxy(target, retryTimes, retryInterval);
		return (T) retryProxy.getProxy();
	}

	@Slf4j
	private static class RetryProxy implements InvocationHandler {

		private static final int DEFAULT_RETRY_TIMES = 3;

		private static final long DEFAULT_RETRY_INTERVAL = 500L;

		private Object target;

		private int retryTimes;

		private long retryInterval;

		private RetryProxy(Object target) {
			this(target, DEFAULT_RETRY_TIMES, DEFAULT_RETRY_INTERVAL);
		}

		private RetryProxy(Object target, int retryTimes, long retryInterval) {
			this.target = target;
			this.retryTimes = retryTimes;
			this.retryInterval = retryInterval;
		}

		public Object getProxy() {
			return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			int rt = retryTimes;
			for (int i = rt; i > 0; i--) {
				try {
					if (i < rt && retryInterval > 0) {
						log.info("sleep...");
						TimeUnit.MILLISECONDS.sleep(retryInterval);
					}

					return method.invoke(target, args);
				} catch (InterruptedException e) {
					// ignore...
				} catch (Exception e) {
					log.error("exception occur: {}", e);
				}
			}

			return null;
		}

	}

}
