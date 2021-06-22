package com.us.improve.ispringboot.feature.importbdr;

import com.us.improve.ispringboot.base.AbstractCommonTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-06-22 17:25
 * @Version 1.0
 **/
@Slf4j
public class ImportBDRTest extends AbstractCommonTest {

	@Autowired
	private Tuesday tuesday;

	@Test
	public void test() {
		log.info("tuesday: {}", tuesday);

		if (tuesday != null) {
			tuesday.doSomething();
			tuesday.displayWeather();
		}
	}

}
