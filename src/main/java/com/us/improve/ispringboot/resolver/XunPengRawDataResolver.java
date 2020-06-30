package com.us.improve.ispringboot.resolver;

import com.us.improve.ispringboot.signal.ISignal;
import com.us.improve.ispringboot.signal.ToiletOccupySignal;
import com.us.improve.ispringboot.signal.ToiletReleaseSignal;
import org.springframework.stereotype.Component;

/**
 * @ClassName XunPengRawDataResolver
 * @Desciption TODO
 * @Author loren
 * @Date 2020/7/1 12:08 AM
 * @Version 1.0
 **/
@Component
public class XunPengRawDataResolver implements IResolver<String> {

    @Override
    public ISignal resolve(String s) {
        if (s.startsWith("0")) {
            return new ToiletOccupySignal();
        } else if (s.startsWith("1")) {
            return new ToiletReleaseSignal();
        }

        return null;
    }

}
