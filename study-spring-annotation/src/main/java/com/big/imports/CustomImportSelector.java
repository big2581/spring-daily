package com.big.imports;

import com.big.bean.Student;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;


/**
 * 通过实现ImportSelector 导入第三方类到spring容器
 *
 * @author Yin
 * @date 2024-10-11 13:07
 */
public class CustomImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Student.class.getName()};
    }
}
