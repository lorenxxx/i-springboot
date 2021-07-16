package com.us.improve.ispringboot.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Author loren
 * @Description ApplicationContext辅助类
 * @Date 2021-07-09 23:13
 * @Version 1.0
 **/
@Component
public class ApplicationContextUtil implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ApplicationContextUtil.applicationContext = applicationContext;
	}

	public ApplicationContext getApplicationContext() {
		return ApplicationContextUtil.applicationContext;
	}

	public static <T> T getBean(String beanName) {
		return (T) ApplicationContextUtil.applicationContext.getBean(beanName);
	}

	public static <T> T getBean(Class<T> clazz) {
		return (T) ApplicationContextUtil.applicationContext.getBean(clazz);
	}

}
