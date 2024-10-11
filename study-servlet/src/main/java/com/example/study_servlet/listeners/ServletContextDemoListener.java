package com.example.study_servlet.listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebListener;

/**
 * 监听器
 * 事件监听机制
 * 事件      一个事件
 * 事件源    事件发生的地方
 * 监听器    一段代码（类）
 * 注册监听  将事件、事件源、监听器绑定到一起。当事件源发生某个事件的时候，执行监听的代码
 *
 * @author Yin
 * @date 2024-09-30 15:05
 */
//@WebListener 注解 配置文件<listener>   </listener>
//@WebListener
//@WebInitParam(name = "contextConfigLocation",value = "/WEB-INF/classes/*")
public class ServletContextDemoListener implements ServletContextListener {
    /**
     * @apiNote ServletContext容器创建后调用的方法
     * @param sce
     * @author Yin
     * @date 2024/09/30 15:09
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //加载资源文件
        ServletContext servletContext = sce.getServletContext();
        //配置web.xml 指定加载目标资源
        String initParameter = servletContext.getInitParameter("contextConfigLocation");
        String realPath = servletContext.getRealPath("/WEB-INF/classes/application.xml");
    }
    /**
     * @apiNote ServletContext容器销毁之前调用的方法
     * @param sce
     * @author Yin
     * @date 2024/09/30 15:09
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
