package com.us.improve.ispringboot.toilet;

import com.us.improve.ispringboot.toilet.enums.ToiletStateEnum;
import com.us.improve.ispringboot.toilet.state.IToiletState;
import lombok.Data;

/**
 * @ClassName Toilet
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/19 3:49 PM
 * @Version 1.0
 **/
@Data
public class Toilet {

    private Integer id;

    private String name;

    private ToiletStateEnum state;

    private IToiletState toiletState;

    public void occupy() {
        toiletState.occupy(this);
    }

    public void release() {
        toiletState.release(this);
    }

}
