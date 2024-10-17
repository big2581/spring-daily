package com.big.imports;

import com.big.models.Task;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * TODO
 *
 * @author Yin
 * @date 2024-10-17 14:47
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        //导入bean 的定义信息
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(Task.class).getBeanDefinition();

        registry.registerBeanDefinition("task", beanDefinition);
    }
}
