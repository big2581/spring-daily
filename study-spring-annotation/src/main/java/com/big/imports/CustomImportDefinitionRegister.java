package com.big.imports;

import com.big.bean.Student;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 实现ImportBeanDefinitionRegistrar 自定义导入第三方类
 *
 * @author Yin
 * @date 2024-10-11 13:15
 */
public class CustomImportDefinitionRegister implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        rootBeanDefinition.setBeanClass(Student.class);
        registry.registerBeanDefinition("student", rootBeanDefinition);
    }
}
