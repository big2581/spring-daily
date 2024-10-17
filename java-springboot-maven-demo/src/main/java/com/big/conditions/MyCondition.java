package com.big.conditions;

import com.big.Annotations.ConditionClassName;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * 自定义Condition 接口条件 判断是否能创建bean
 *
 * @author Yin
 * @date 2024-10-17 13:58
 */
public class MyCondition implements Condition {

    /**
     * @param context  上下文对象 可以获取属性值，类加载器，获取beanFactory
     * @param metadata 元数据对象 用于获取注解的属性
     * @return boolean true 是否返回对象
     * @apiNote 是否创建执行方法
     * @author Yin
     * @date 2024/10/17 14:00
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //获取当前注解
        Map<String, Object> name = metadata.getAnnotationAttributes(ConditionClassName.class.getName());
        //获取注解的属性
        Object name1 = name.get("value");
        if (!"abv".equals(name1)) {
            return false;
        }
        return true;
    }
}
