package com.us.improve.ispringboot.event.handler;

import com.us.improve.ispringboot.event.IEvent;
import com.us.improve.ispringboot.event.ToiletReleaseEvent;
import org.springframework.stereotype.Component;

/**
 * @ClassName ToiletReleaseEventHandler
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/30 10:44 PM
 * @Version 1.0
 **/
@Component
public class ToiletReleaseEventHandler implements IEventHandler {

    @Override
    public boolean accept(IEvent event) {
        return event != null && event instanceof ToiletReleaseEvent;
    }

    @Override
    public void handle(IEvent event) {

    }

}
