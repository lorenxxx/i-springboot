package com.us.improve.ispringboot.base;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @ClassName AbstractMockTest
 * @Desciption Mock测试基类
 * @Author loren
 * @Date 2020/7/3 4:11 PM
 * @Version 1.0
 **/
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class AbstractMockTest extends AbstractBaseTest {

	protected MockMvc mockMvc;

	@Autowired
	private WebApplicationContext context;

	@BeforeClass
	public static void beforeClass() {

	}

	@AfterClass
	public static void afterClass() {

	}

	@Before
	public void before() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@After
	public void after() {

	}

}
