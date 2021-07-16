package com.us.improve.ispringboot.demo.impl;

import com.us.improve.ispringboot.demo.IBusinessService;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-07-16 18:11
 * @Version 1.0
 **/
@Service
public class BusinessService implements IBusinessService {

	@Override
	public String doBusiness() {
		if (new Random().nextBoolean()) {
			throw new RuntimeException("Random Exception");
		}

		System.out.println("do business...");
		return "success";
	}

}
