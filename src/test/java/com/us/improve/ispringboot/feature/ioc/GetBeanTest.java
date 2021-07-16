package com.us.improve.ispringboot.feature.ioc;

import com.us.improve.ispringboot.base.AbstractCommonTest;
import com.us.improve.ispringboot.util.ApplicationContextUtil;
import com.us.improve.ispringboot.util.BeanFactoryUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class GetBeanTest extends AbstractCommonTest {

	@Test
	public void testGetBeanByBeanFactory() {
		MyBean myBean = BeanFactoryUtil.getBean("myBean");
		log.info("myBean: {}", myBean);
	}

	@Test
	public void testGetBeanByApplicationContext() {
		MyBean myBean = ApplicationContextUtil.getBean("myBean");
		log.info("myBean: {}", myBean);
	}

}