package com.us.improve.ispringboot.feature.importbdr;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-06-22 17:17
 * @Version 1.0
 **/
@Data
@Slf4j
public class Tuesday {

	private String weather;

	public void doSomething() {
		log.info("Tuesday, fuck!!!");
	}

	public void displayWeather() {
		log.info("Weather: {}", weather);
	}

}
