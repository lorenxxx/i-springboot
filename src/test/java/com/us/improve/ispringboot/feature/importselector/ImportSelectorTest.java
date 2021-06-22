package com.us.improve.ispringboot.feature.importselector;

import com.us.improve.ispringboot.base.AbstractCommonTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-06-22 17:13
 * @Version 1.0
 **/
@Slf4j
public class ImportSelectorTest extends AbstractCommonTest {

	@Autowired
	private Monday monday;

	@Test
	public void test() {
		log.info("monday: {}", monday);

		if (monday != null) {
			monday.doSomething();
		}
	}

}
