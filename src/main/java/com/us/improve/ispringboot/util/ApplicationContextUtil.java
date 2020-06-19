package com.us.improve.ispringboot.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @ClassName ApplicationContextUtil
 * @Desciption Spring应用上下文工具类
 * @Author loren
 * @Date 2020/6/10 3:10 PM
 * @Version 1.0
 **/
@Component
public class ApplicationContextUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextUtil.applicationContext = applicationContext;
    }

    public Object getBean(Class clazz) {
        return applicationContext.getBean(clazz);
    }

    public Object getBean(String beanName) {
        return applicationContext.getBean(beanName);
    }

}
