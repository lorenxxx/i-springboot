package com.us.improve.ispringboot.demo.impl;

import com.us.improve.ispringboot.demo.IBusiness;

import java.util.Random;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-07-16 17:54
 * @Version 1.0
 **/
public class Business implements IBusiness {

	@Override
	public String doBusiness() {
		if (new Random().nextBoolean()) {
			throw new RuntimeException("Random Exception");
		}

		System.out.println("do business...");
		return "success";
	}

}
