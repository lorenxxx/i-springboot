package com.us.improve.ispringboot.toilet;

import com.us.improve.ispringboot.toilet.service.IToiletService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName ToiletTest
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/19 4:53 PM
 * @Version 1.0
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class ToiletTest {

    @Autowired
    private IToiletService toiletService;

    @Test
    public void test1() {
        Toilet toilet = toiletService.getToiletById(1);
        log.info("result: {}", toilet);

        toilet.occupy();
        toilet.release();


        toilet = toiletService.getToiletById(2);
        log.info("result: {}", toilet);

        toilet.release();
    }

}
