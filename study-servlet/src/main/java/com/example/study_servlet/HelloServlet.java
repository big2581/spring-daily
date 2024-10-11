package com.example.study_servlet;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //流量器上发送的请求分为四部分
        //请求行 请求头  请求空行  请求体
        //


        String method = request.getMethod();//请求方法
        String contextPath = request.getContextPath();//tomcat 虚拟目录结构默认/
        String servletPath = request.getServletPath();//Servlet 路径Url pattern 注解上的@WebServlet value值
        String requestURI = request.getRequestURI();// contextPath + servletPath  /hello-servlet"
        StringBuffer requestURL = request.getRequestURL();// http://localhost:8080/contextPath + servletPath 拼接上前面一段
        String queryString = request.getQueryString();// 路径上参数 ？之后的键值对
        String protocol = request.getProtocol();//协议版本
        String remoteAddr = request.getRemoteAddr();//远程调用地址


        //URL 统一资源定位符 小一些
        //URI 统一资源标识符 大一些


        //获取请求头数据
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String element = headerNames.nextElement();
            String header = request.getHeader(element);
            System.out.println(header);
        }
        //比较重要的 从来里的 从那个页面跳转过来的
        String referer = request.getHeader("referer"); //相当于 一个URL
        //流量器请求的工具 谷歌、火狐、ie、postman
        String headers = request.getHeader("user-agent");

        //请求体
        //字节流输出流
        ServletInputStream inputStream = request.getInputStream();
        byte[] b = new byte[1024];
        int len;
        while ((len = inputStream.read(b)) != -1) {
            //读取字节
        }

        //字符输出流
        BufferedReader reader = request.getReader();
        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }


        // 通用方法
        String username = request.getParameter("username");
        // 复选框多个值
        String[] happies = request.getParameterValues("happy");
        //返回所有参数的参数名称
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String nextElement = parameterNames.nextElement();
            String parameter = request.getParameter(nextElement);
        }
        // 参数名和参数值 String[] 为了兼容复选框
        Map<String, String[]> parameterMap = request.getParameterMap();


        // 中文乱码  ==> 获取请求参数之前 设置编码方式
        request.setCharacterEncoding("uft-8");


        //转发资源 一种服务器资源内部跳转的方式
        request.getRequestDispatcher("/study").forward(request, response);
        //转发资源的特点
        //1.流量器请求路径没有变化 2.只能转发到当地服务器内部资源 3.转发只是一次请求  所有资源都是共享

        //共享域 request域
        request.setAttribute("abc", "123");
        Object abc = request.getAttribute("abc");
        request.removeAttribute("abc");


        //获取 ServletContext
        ServletContext servletContext = request.getServletContext();


        //response 响应体数据
        //返回的报文 格式 响应行  响应头 响应体
        // Http/1.1 200 ok                        响应行

        // Content-Type: text/html;charset=utf-8  响应体
        // Content-Length: 101

        // <html>                                 响应体
        //    <head>
        //    <title>张三</title>
        //    </head>
        // </html>
        //

        //状态码
        //1. 1xx 服务器接受客户端消息，但没有接受完成，等待一段时间后 发送1xx状态码
        //2. 2xx 200（成功）
        //3. 3xx 302（重定向）304（缓存）
        //4. 4xx 客户端错误 404 （路径错误）  405（请求方法错误）
        //5. 5xx 服务器错误 500（服务器内部异常）
        response.setStatus(200);

        //响应头的信息 常见的
        //Content-Type 服务器端告诉客户端本次响应体数据格式和编码方式
        //Content-disposition 服务器告诉客户端意思嘛格式打开响应体的数据
        //                     值默认 in-line 在当前页面打开
        //                            attachment;filename=xxx 以附件的形式打开响应体。 文件下载
        response.setHeader("Content-Type", "text/html;charset=utf-8");


        //重定向 服务告诉流量器 你要重定向 设置响应状态码 302
        // 并告诉浏览器请求路径 设置响应请求头数据location 填写 重定向路径
        response.setStatus(302);
        response.setHeader("location", "/abc");

        //简单的重定向
        response.sendRedirect("/abc");
        // 重定向特点
        // 1.浏览器发送两次请求
        // 2.请求路径会发生变化
        // 3.重定向可以跳转到其他服务器资源

        //forward redirect

        //获取ServletContext
        ServletContext servletContext1 = request.getServletContext();
        ServletContext servletContext2 = this.getServletContext();
        System.out.println(servletContext1 == servletContext2);

        //文件的位置
        String filename = "abc.jpg";
        //文件会出现中文乱码
        //个个浏览器解析文件名称解码方式都不同 导致会出现乱码  根据规则设置不同浏览器设置不停编码方式
        filename.getBytes(StandardCharsets.UTF_8);//这是默认的
        //获取文件的MIME类型 也就是相对应Content-Type的值
        String mimeType = servletContext1.getMimeType(filename);

        //域对象 共享位置
        servletContext.setAttribute("efg", "aaa");

        //获取服务文件的绝对路径 servletContext2相当于已经定位到了webapp目录下了
        String realPath = servletContext2.getRealPath("/b.txt");//web tomcat下的数据
        String wenInfoPath = servletContext2.getRealPath("/WEB-INF/b.txt");//WEB-INF tomcat下的数据
        String srcPath = servletContext2.getRealPath("/WEB-INF/classes/b.txt");//src tomcat下的数据


        //响应体  就是真实数据
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");


    }

    public void destroy() {
    }
}