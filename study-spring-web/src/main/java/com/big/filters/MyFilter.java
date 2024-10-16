package com.big.filters;

import javax.servlet.*;
import java.io.IOException;

/**
 * web 三大组件之  Filter
 *
 * @author Yin
 * @date 2024-10-15 10:17
 */
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("过滤器.....init");
    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("UTF-8");
        servletResponse.setCharacterEncoding("UTF-8");
        System.out.println("过滤器.....doFilter");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
