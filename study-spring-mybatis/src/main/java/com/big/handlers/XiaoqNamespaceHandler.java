package com.big.handlers;

import com.big.handlers.parser.ScannerBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 可以注册多个自定义标签解析器
 *
 * @author Yin
 * @date 2024-10-10 15:06
 */
public class XiaoqNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        this.registerBeanDefinitionParser("tag", new ScannerBeanDefinitionParser());
    }
}
