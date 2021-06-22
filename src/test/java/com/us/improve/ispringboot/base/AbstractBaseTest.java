package com.us.improve.ispringboot.base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName AbstractBaseTest
 * @Desciption 测试顶级基类
 * @Author loren
 * @Date 2020/7/3 4:08 PM
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
public abstract class AbstractBaseTest {

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
