package com.us.improve.ispringboot.base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName AbstractCommonTest
 * @Desciption 普通测试基类
 * @Author loren
 * @Date 2020/7/3 4:09 PM
 * @Version 1.0
 **/
@SpringBootTest
public abstract class AbstractCommonTest extends AbstractBaseTest {

	@BeforeClass
	public static void beforeClass() {

	}

	@AfterClass
	public static void afterClass() {

	}

	@Before
	public void before() {

	}

	@After
	public void after() {

	}

}
