package com.big;

import java.lang.annotation.*;

/**
 * TODO
 *
 * 注解的取值
 * 基本数据类型
 * String
 * 注解
 * 枚举
 * 以上类型的数据
 *
 * 必须要有值
 *
 * 注解的作用
     * 编译时检查 Override
     * 编写文档  javadoc
     * 代码分析  自定义注解
 *
 *
 * 定义属性时  必须要给属性名赋值
 * 如果注解只有一个属性 且属性名时value时 可以属性名称省略不写 直接写值
 *
 *
 * @author Yin
 * @date 2024-09-29 10:01
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented //文档
@Inherited  // 继承
public @interface Annotation {

    int show1() default 12;

    String show2();

    StatusEnum show3();
    /**
     * @apiNote  值    @OtherAnnotation
     * @return com.big.OtherAnnotation
     * @author Yin
     * @date 2024/09/29 10:21
     */
    OtherAnnotation show4();
    /**
     * @apiNote  如果数组中只有一个数值 那就可以省略大括号 直接 "sbc"
     * @return java.lang.String[]
     * @author Yin
     * @date 2024/09/29 10:20
     */
    String[] strs();

}
