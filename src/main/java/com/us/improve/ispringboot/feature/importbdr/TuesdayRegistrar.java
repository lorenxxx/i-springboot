package com.us.improve.ispringboot.feature.importbdr;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-06-22 17:18
 * @Version 1.0
 **/
public class TuesdayRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		BeanDefinition beanDefinition = new RootBeanDefinition(Tuesday.class);

		MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
		propertyValues.addPropertyValue("weather", "rain");

		registry.registerBeanDefinition("tuesday", beanDefinition);
	}

}
