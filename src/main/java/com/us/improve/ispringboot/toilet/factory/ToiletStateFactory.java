package com.us.improve.ispringboot.toilet.factory;

import com.us.improve.ispringboot.toilet.state.IToiletState;
import com.us.improve.ispringboot.toilet.Toilet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName ToiletStateFactory
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/19 4:41 PM
 * @Version 1.0
 **/
@Component
public class ToiletStateFactory {

    @Autowired
    private List<IToiletState> toiletStates;

    public IToiletState getToiletState(Toilet toilet) {
        if (toilet == null) {
            throw new NullPointerException("toilet is null.");
        }

        for (IToiletState toiletState : toiletStates) {
            if (toiletState.getDesc().equals(toilet.getState())) {
                return toiletState;
            }
        }

        return null;
    }

}
