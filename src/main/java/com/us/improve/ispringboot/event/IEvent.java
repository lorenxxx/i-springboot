package com.us.improve.ispringboot.event;

import com.us.improve.ispringboot.event.handler.IEventHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName IEvent
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/30 10:20 PM
 * @Version 1.0
 **/
public interface IEvent {

    default void happen() {
        // todo 从Spring容器获取
        List<IEventHandler> eventHandlers = new ArrayList<>();

        for (IEventHandler eventHandler : eventHandlers) {
            if (eventHandler.accept(this)) {
                eventHandler.handle(this);
                break;
            }
        }
    }

}