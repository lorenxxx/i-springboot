package com.us.improve.ispringboot.toilet;

import com.us.improve.ispringboot.event.IEvent;
import com.us.improve.ispringboot.event.converter.IEventConverter;
import com.us.improve.ispringboot.resolver.IResolver;
import com.us.improve.ispringboot.signal.ISignal;
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

    @Autowired
    private IResolver<String> resolver;

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

    @Test
    public void test2() {
        String rawData = "0A0101";

        ISignal signal = resolver.resolve(rawData);
        IEvent event = ((IEventConverter) signal).convert2Event();
        event.happen();
    }

}
