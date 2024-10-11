package com.big.handlers.parser;

import com.big.processors.XiaoqBeanPostProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * 自定义解析标签
 *
 * @author Yin
 * @date 2024-10-10 15:09
 */
public class ScannerBeanDefinitionParser implements BeanDefinitionParser {
    @Override
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        rootBeanDefinition.setBeanClassName("com.big.processors.XiaoqBeanPostProcessor");
        parserContext.getRegistry().registerBeanDefinition("xiaoqBeanPostProcessor",rootBeanDefinition);
        return rootBeanDefinition;
    }
}
