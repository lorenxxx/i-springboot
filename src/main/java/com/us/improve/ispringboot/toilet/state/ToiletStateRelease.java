package com.us.improve.ispringboot.toilet.state;

import com.us.improve.ispringboot.toilet.Toilet;
import com.us.improve.ispringboot.toilet.enums.ToiletStateEnum;
import com.us.improve.ispringboot.toilet.service.IToiletService;
import com.us.improve.ispringboot.toilet.state.IToiletState;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName StateIdle
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/19 3:19 PM
 * @Version 1.0
 **/
@Component
@Slf4j
public class ToiletStateRelease implements IToiletState {

    @Autowired
    private IToiletService toiletService;

    @Override
    public ToiletStateEnum getDesc() {
        return ToiletStateEnum.RELEASE;
    }

    @Override
    public void occupy(Toilet toilet) {
        toiletService.occupyToilet(toilet);
        log.info("Occupy done...");
    }

    @Override
    public void release(Toilet toilet) {
        log.info("Warning: Already release!!!");
    }

}
