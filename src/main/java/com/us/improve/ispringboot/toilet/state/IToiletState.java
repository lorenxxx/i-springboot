package com.us.improve.ispringboot.toilet.state;

import com.us.improve.ispringboot.toilet.Toilet;
import com.us.improve.ispringboot.toilet.enums.ToiletStateEnum;

/**
 * @ClassName IState
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/19 3:15 PM
 * @Version 1.0
 **/
public interface IToiletState {

    /**
     * 获取状态类型的描述信息
     *
     * @return
     */
    ToiletStateEnum getDesc();

    /**
     * 占用
     *
     * @param toilet
     */
    void occupy(Toilet toilet);

    /**
     * 释放
     *
     * @param toilet
     */
    void release(Toilet toilet);

}