package com.us.improve.ispringboot.toilet.service;

import com.us.improve.ispringboot.toilet.Toilet;

/**
 * @ClassName IToiletService
 * @Desciption TODO
 * @Author loren
 * @Date 2020/6/19 4:17 PM
 * @Version 1.0
 **/
public interface IToiletService {

    int saveToilet(Toilet toilet);

    int occupyToilet(Toilet toilet);

    int releaseToilet(Toilet toilet);

    Toilet getToiletById(Integer id);

    Toilet getToiletBySenorId(Integer sensorId);

}