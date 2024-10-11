package com.big.anno;

import com.big.imports.CustomImportDefinitionRegister;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义导入第三方定义好的类
 *
 * @author Yin
 * @date 2024-10-11 13:03
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(CustomImportDefinitionRegister.class)
public @interface CustomAnnotation {

}
