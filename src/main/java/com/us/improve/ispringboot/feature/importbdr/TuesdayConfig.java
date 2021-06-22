package com.us.improve.ispringboot.feature.importbdr;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-06-22 17:26
 * @Version 1.0
 **/
@Configuration
@Import({ TuesdayRegistrar.class })
public class TuesdayConfig {

}
