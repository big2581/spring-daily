package com.big.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * SpringMvc拦截器 作用与Servlet 与 controller 之间的 功能类似于Filter
 * 过滤器 作用与 web应用服务器 和 Servlet之间   作用范围不一样
 * Interceptor拦截与controller资源功能
 * <p>
 * Filter     javaWeb原生技术      可以对所有资源都过滤包括任何的servlet、jsp、其他资源 都可以   早于任何Servlet
 * Interceptor springmvc技术框架   只有进入springmvc范围内才进行拦截  主要是拦截Controller 中每个方法   晚于DispatchServlet执行
 *
 * @author Yin
 * @date 2024-10-15 17:34
 */
public class MyHandlerInterceptor implements HandlerInterceptor {
    /**
     * @param request
     * @param response
     * @param handler  handler 是拦截到的Controller方法处理器
     * @return boolean 返回true放行执行处理器方法，false不放行
     * @apiNote 对拦截到的请求进行预处理，
     * @author Yin
     * @date 2024/10/15 17:46
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {


        return true;
    }

    /**
     * @param request
     * @param response
     * @param handler      handler 是拦截到的Controller方法处理器
     * @param modelAndView 返回的模型视图对象
     * @apiNote 在处理器的方法执行后，对拦截到的请求进行后处理 ，可以在方法中对模型数据和视图进行修改
     * @author Yin
     * @date 2024/10/15 17:48
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
     * @param request
     * @param response
     * @param handler  handler 是拦截到的Controller方法处理器
     * @param ex       异常对象
     * @apiNote 视图渲染完成后（整个流程结束之后），进行最后的处理，如果请求流程中有异常，可以处理异常对象
     * @author Yin
     * @date 2024/10/15 17:50
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
