package com.us.improve.ispringboot.resolver;

import com.us.improve.ispringboot.signal.ISignal;

/**
 * @ClassName IResolver
 * @Desciption TODO
 * @Author loren
 * @Date 2020/7/1 12:05 AM
 * @Version 1.0
 **/
public interface IResolver<T> {

    ISignal resolve(T t);

}