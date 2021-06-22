package com.us.improve.ispringboot.feature.importselector;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-06-22 17:12
 * @Version 1.0
 **/
@Configuration
@Import( {MondaySelector.class} )
public class MondayConfig {

}
