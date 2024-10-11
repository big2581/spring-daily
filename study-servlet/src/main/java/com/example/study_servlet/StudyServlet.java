package com.example.study_servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * B/S 架构
 * 浏览器 访问 服务器
 * java程序时运行在服务器上的
 * java程序和服务器（Tomcat）之间必须有一个连通可识别的接口（Servlet）
 * 那就是 Servlet 接口  英文解释 Server Applet  服务小程序
 * 就能让浏览器访问服务器到达指定的java类 实现不同的逻辑
 *
 * 具体
 * 1.创建javaEE 项目
 * 2.定义一个类 实现Servlet 接口
 * 3.实现接口中的方法
 * 4.配置Servlet /webapp/WEB-INF/web.xml
 *
 *
 * @author Yin
 * @date 2024-09-29 16:52
 */
public class StudyServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {


        System.out.println("接口服务类");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
