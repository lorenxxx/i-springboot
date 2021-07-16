package com.us.improve.ispringboot.util;

import com.us.improve.ispringboot.base.AbstractCommonTest;
import com.us.improve.ispringboot.demo.IBusiness;
import com.us.improve.ispringboot.demo.IBusinessService;
import com.us.improve.ispringboot.demo.impl.Business;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class RetrySupportTest extends AbstractCommonTest {

	@Autowired
	private IBusinessService businessService;

	@Test
	public void test1() {
		// [spring bean] 直接调用，无重试效果
		businessService.doBusiness();
	}

	@Test
	public void test2() {
		// [spring bean] 通过代理类调用，有重试效果
		IBusinessService businessServiceProxy = RetrySupport.getRetryProxy(businessService);
		businessServiceProxy.doBusiness();
	}

	@Test
	public void test3() {
		// [普通Java类] 直接调用，无重试效果
		IBusiness business = new Business();
		business.doBusiness();
	}

	@Test
	public void test4() {
		// [普通Java类] 通过代理类调用，有重试效果
		IBusiness business = new Business();

		IBusiness businessProxy = RetrySupport.getRetryProxy(business);
		businessProxy.doBusiness();
	}

}