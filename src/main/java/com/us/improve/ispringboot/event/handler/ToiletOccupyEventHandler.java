package com.us.improve.ispringboot.event.handler;

import com.us.improve.ispringboot.event.IEvent;
import com.us.improve.ispringboot.event.ToiletOccupyEvent;
import com.us.improve.ispringboot.toilet.Toilet;
import com.us.improve.ispringboot.toilet.service.IToiletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName ToiletOccupyEventHandler
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/30 10:43 PM
 * @Version 1.0
 **/
@Component
public class ToiletOccupyEventHandler implements IEventHandler {

    @Autowired
    private IToiletService toiletService;

    @Override
    public boolean accept(IEvent event) {
        return event != null && event instanceof ToiletOccupyEvent;
    }

    @Override
    public void handle(IEvent event) {
        ToiletOccupyEvent toiletOccupyEvent = (ToiletOccupyEvent) event;
        Toilet toilet = toiletService.getToiletBySenorId(toiletOccupyEvent.getEventProducer());
        if (toilet == null) {
            return;
        }
        toilet.occupy();
    }

}
