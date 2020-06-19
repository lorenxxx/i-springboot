package com.us.improve.ispringboot.toilet.state;

import com.us.improve.ispringboot.toilet.Toilet;
import com.us.improve.ispringboot.toilet.enums.ToiletStateEnum;
import com.us.improve.ispringboot.toilet.service.IToiletService;
import com.us.improve.ispringboot.toilet.state.IToiletState;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName StateOccupy
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/19 3:18 PM
 * @Version 1.0
 **/
@Component
@Slf4j
public class ToiletStateOccupy implements IToiletState {

    @Autowired
    private IToiletService toiletService;

    @Override
    public ToiletStateEnum getDesc() {
        return ToiletStateEnum.OCCUPY;
    }

    @Override
    public void occupy(Toilet toilet) {
        log.info("Warning: Already occupy!!!");
    }

    @Override
    public void release(Toilet toilet) {
        toiletService.releaseToilet(toilet);
        log.info("Release done...");
    }

}
