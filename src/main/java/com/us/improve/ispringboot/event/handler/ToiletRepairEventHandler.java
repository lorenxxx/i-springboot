package com.us.improve.ispringboot.event.handler;

import com.us.improve.ispringboot.event.IEvent;
import com.us.improve.ispringboot.event.ToiletRepairEvent;
import org.springframework.stereotype.Component;

/**
 * @ClassName ToiletRepairEventHandler
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/30 10:44 PM
 * @Version 1.0
 **/
@Component
public class ToiletRepairEventHandler implements IEventHandler {

    @Override
    public boolean accept(IEvent event) {
        return event != null && event instanceof ToiletRepairEvent;
    }

    @Override
    public void handle(IEvent event) {

    }
}
