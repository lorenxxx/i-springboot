package com.us.improve.ispringboot.event;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName ToiletOccupyEvent
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/30 10:41 PM
 * @Version 1.0
 **/
@Data
public class ToiletOccupyEvent implements IEvent {

    private Integer eventProducer;

    private String eventData;


}
