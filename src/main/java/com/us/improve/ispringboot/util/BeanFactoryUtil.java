package com.us.improve.ispringboot.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

/**
 * @Author loren
 * @Description BeanFactory辅助类
 * @Date 2021-07-09 23:13
 * @Version 1.0
 **/
@Component
public class BeanFactoryUtil implements BeanFactoryAware {

	private static BeanFactory beanFactory;

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		BeanFactoryUtil.beanFactory = beanFactory;
	}

	public static BeanFactory getBeanFactory() {
		return BeanFactoryUtil.beanFactory;
	}

	public static <T> T getBean(String beanName) {
		return (T) BeanFactoryUtil.beanFactory.getBean(beanName);
	}

	public static <T> T getBean(Class<T> clazz) {
		return (T) BeanFactoryUtil.beanFactory.getBean(clazz);
	}

}
