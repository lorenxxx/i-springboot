package com.us.improve.ispringboot.event.handler;

import com.us.improve.ispringboot.event.IEvent;

/**
 * @ClassName IEventHandler
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/30 10:44 PM
 * @Version 1.0
 **/
public interface IEventHandler {

    boolean accept(IEvent event);

    void handle(IEvent event);

}