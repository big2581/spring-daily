package com.big.listeners;

import com.big.context.MyAnnotationApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Listener 监听器
 *
 * @author Yin
 * @date 2024-10-15 10:19
 */
public class MyContextLoaderListener extends ContextLoaderListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("初始化监听器。。。。。init");
//        ServletContext servletContext = sce.getServletContext();
//        String contextLoaderLocation = servletContext.getInitParameter("contextLoaderLocation");
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(contextLoaderLocation.substring("classpath:".length()));


//        servletContext.setAttribute("context", context);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
