package com.us.improve.ispringboot.feature.importselector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author loren
 * @Description TODO
 * @Date 2021-06-22 17:11
 * @Version 1.0
 **/
public class MondaySelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[] { "com.us.improve.ispringboot.feature.importselector.Monday" };
	}

}
