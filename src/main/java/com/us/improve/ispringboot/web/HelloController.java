package com.us.improve.ispringboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Desciption TODO
 * @Author loren
 * @Date 2019/1/11 7:08 PM
 * @Version 1.0
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/demo")
    public String demo() {
        return "DEMO";
    }

}
