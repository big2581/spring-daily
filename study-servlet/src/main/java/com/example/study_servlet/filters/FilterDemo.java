package com.example.study_servlet.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 过滤器
 * java web 三大组件
 * <p>
 * javax.servlet.Servlet
 * javax.servlet.Filter
 * javax.servlet.Listener
 *
 * @author Yin
 * @date 2024-09-30 13:46
 */
//url 拦截路径
//    dispatcherTypes 配置拦截方式

/**
 * FORWARD, //只有在资源转发的才会拦截
 * INCLUDE, //
 * REQUEST, //默认 都回被拦截
 * ASYNC,
 * ERROR;
 *
 *
 * 拦截器执行的顺序按照
 * 1.注解 按照类名比较 小的先执行
 * 2.web.xml 按照谁先在<filter-mapping></filter-mapping> 上面谁先执行
 *
 *
 * @author Yin
 * @date 2024/09/30 14:18
 */

@WebFilter(urlPatterns = "/*", dispatcherTypes = {DispatcherType.REQUEST})
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //服务启动时 调用方法 只会执行一次
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //统一编码方式
        servletRequest.setCharacterEncoding("uft-8");
        //放行
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        //服务器正常关闭调用方法  释放资源
    }
}
