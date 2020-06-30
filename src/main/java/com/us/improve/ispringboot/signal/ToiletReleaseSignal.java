package com.us.improve.ispringboot.signal;

import com.us.improve.ispringboot.event.IEvent;
import com.us.improve.ispringboot.event.ToiletReleaseEvent;
import com.us.improve.ispringboot.event.converter.IEventConverter;

/**
 * @ClassName ToiletReleaseSignal
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/30 11:56 PM
 * @Version 1.0
 **/
public class ToiletReleaseSignal implements ISignal, IEventConverter {

    @Override
    public IEvent convert2Event() {
        return new ToiletReleaseEvent();
    }

}
