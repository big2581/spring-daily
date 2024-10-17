package com.big.imports;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 *
 *
 * @author Yin
 * @date 2024-10-17 14:46
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //导入一个类的权限定名

        return new String[]{"com.big.models.Task"};
    }
}
