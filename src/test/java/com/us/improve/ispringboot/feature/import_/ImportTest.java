package com.us.improve.ispringboot.feature.import_;

import com.us.improve.ispringboot.base.AbstractCommonTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-06-22 17:01
 * @Version 1.0
 **/
@Slf4j
public class ImportTest extends AbstractCommonTest {

	@Autowired
	private Friday friday;

	@Test
	public void test() {
		log.info("friday: {}", friday);

		if (friday != null) {
			friday.doSomething();
		}
	}

}
