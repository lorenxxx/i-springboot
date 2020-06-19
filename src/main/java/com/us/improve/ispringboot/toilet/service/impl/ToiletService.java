package com.us.improve.ispringboot.toilet.service.impl;

import com.oracle.tools.packager.Log;
import com.us.improve.ispringboot.toilet.Toilet;
import com.us.improve.ispringboot.toilet.enums.ToiletStateEnum;
import com.us.improve.ispringboot.toilet.factory.ToiletStateFactory;
import com.us.improve.ispringboot.toilet.service.IToiletService;
import lombok.experimental.Tolerate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName ToiletService
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/19 4:18 PM
 * @Version 1.0
 **/
@Service
@Slf4j
public class ToiletService implements IToiletService {

    @Autowired
    private ToiletStateFactory toiletStateFactory;

    @Override
    public int saveToilet(Toilet toilet) {
        return 0;
    }

    @Override
    public int occupyToilet(Toilet toilet) {
        log.info("占用厕所成功");
        return 1;
    }

    @Override
    public int releaseToilet(Toilet toilet) {
        log.info("释放厕所成功");
        return 1;
    }

    @Override
    public Toilet getToiletById(Integer id) {
        // 模拟从库中查询出
        Toilet toilet = new Toilet();
        toilet.setId(id);
        toilet.setName("WuHan_BaoLi_Male_001");
        if (id == 1) {
            toilet.setState(ToiletStateEnum.OCCUPY);
        } else {
            toilet.setState(ToiletStateEnum.RELEASE);
        }

        toilet.setToiletState(toiletStateFactory.getToiletState(toilet));

        return toilet;
    }

    @Override
    public Toilet getToiletBySenorId(Integer sensorId) {
        return null;
    }

}
