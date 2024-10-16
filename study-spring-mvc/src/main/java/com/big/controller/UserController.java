package com.big.controller;

import com.big.bean.User;
import com.big.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * 前端控制器
 * <p>
 * 处理器映射器 HandlerMapping 匹配映射路径对应的Handler，返回可执行的处理链对象HandlerExecutionChain 对象   RequestMappingHandlerMapping
 * 处理器适配器 HandlerAdapter 匹配HandlerExecutionChain 对应的适配器进行处理器调用，返回视图模型对象   RequestMappingHandlerAdapter
 * 视图解析器   ViewResolver  对试图模型对象进行解析   InternalResourceResolver
 *
 * @author Yin
 * @date 2024-10-15 13:35
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("show")
    public String show(String name, Integer age) {
        String oneUser = userService.getOneUser();
        System.out.println("show正在正在执行......." + oneUser);
        return "/index.jsp";
    }

    @RequestMapping("show1")
    public String show1(@RequestParam(name = "username") String name) {
        String oneUser = userService.getOneUser();
        System.out.println("show1 正在正在执行......." + oneUser);
        return "/index.jsp";
    }

    @RequestMapping("show2")
    public String show2(String[] happy) {
        String oneUser = userService.getOneUser();
        System.out.println("show2 正在正在执行......." + oneUser);
        return "/index.jsp";
    }

    @RequestMapping("show3")
    public String show3(@RequestParam List<String> happy) {
        String oneUser = userService.getOneUser();
        System.out.println("show3 正在正在执行......." + oneUser);
        return "/index.jsp";
    }

    @RequestMapping("show4")
    public String show4(@RequestParam Map<String, String> info) {
        String oneUser = userService.getOneUser();
        System.out.println("show4 正在正在执行......." + oneUser);
        return "/index.jsp";
    }

    @RequestMapping("show5")
    public String show5(@RequestParam(name = "name", required = true) String username) {
        String oneUser = userService.getOneUser();
        System.out.println("show5 正在正在执行......." + oneUser);
        return "/index.jsp";
    }

    /**
     * @apiNote 参数封装是 都是设置的包装类的数据 所以在参数接受时最好使用包装类
     * 基本类型不能转换 由 null - 基本数据类型
     * 当参数没有注解时 mvc会帮你new一个具体的对象像List，Map 是一个接口  不能创建对象 会出翔异常
     * 有注解会认定是一个容器
     * @author Yin
     * @date 2024/10/15 14:58
     */

    @RequestMapping("show6")
    public String show6(@RequestBody String body) {
        String oneUser = userService.getOneUser();
        System.out.println("show6 正在正在执行......." + oneUser);
        return "/index.jsp";
    }


    /**
     * @param user 解析对应的对象
     *             <p>
     *             配置 MappingJackson2HttpMessageConverter 映入Maven jackson-databind 才生效
     * @return java.lang.String
     * @apiNote
     * @author Yin
     * @date 2024/10/15 15:24
     */
    @PostMapping("show8")
    public String show8(@RequestBody User user) {
        System.out.println(user);
        String oneUser = userService.getOneUser();
        System.out.println("show8 正在正在执行......." + oneUser);
        return "/index.jsp";
    }

    /**
     * @param id path值
     * @return java.lang.String
     * @apiNote rest风格
     * @author Yin
     * @date 2024/10/15 15:19
     */
    @RequestMapping("show7/{id}")
    public String show7(@PathVariable("id") String id) {
        String oneUser = userService.getOneUser();
        System.out.println("show7 正在正在执行......." + oneUser);
        return "/index.jsp";
    }

    /**
     * @param file 文件内容
     *             文件上传视图解析器 未配置  需要配置开启 引入Maven commons-fileupload
     * @return java.lang.String
     * @apiNote 文件上传
     * @author Yin
     * @date 2024/10/15 16:03
     */
    @PostMapping("upload")
    public String upload(@RequestBody MultipartFile file) {
        System.out.println(file);
        String oneUser = userService.getOneUser();
        System.out.println("upload 正在正在执行......." + oneUser);
        return "/index.jsp";
    }

    /**
     * @param type 请求头
     * @return java.lang.String
     * @apiNote 获取请求头的数据 单个值
     * @author Yin
     * @date 2024/10/15 16:21
     */
    @RequestMapping("show9")
    public String show9(@RequestHeader("Content-Type") String type) {
        String oneUser = userService.getOneUser();
        System.out.println(oneUser + " show9 正在执行......." + type);
        return "/index.jsp";
    }

    /**
     * @param headers 请求头
     * @return java.lang.String
     * @apiNote 获取请求头的数据所有
     * @author Yin
     * @date 2024/10/15 16:21
     */
    @RequestMapping("show10")
    public String show10(@RequestHeader Map<String, String> headers) {
        String oneUser = userService.getOneUser();
        System.out.println(oneUser + " show10 正在执行......." + headers);
        return "/index.jsp";
    }

    /**
     * @param cookie cookie
     * @return java.lang.String
     * @apiNote 获取cookie 数据
     * @author Yin
     * @date 2024/10/15 16:21
     */
    @RequestMapping("show11")
    public String show11(@CookieValue(name = "JSESSIONID", defaultValue = "") String cookie) {
        String oneUser = userService.getOneUser();
        System.out.println(oneUser + " show11 正在执行......." + cookie);
        return "/index.jsp";
    }

    /**
     * @param name
     * @param age
     * @return java.lang.String
     * @apiNote 向域中存储数据
     * @author Yin
     * @date 2024/10/15 16:33
     */
    @RequestMapping("show12")
    public String show12(@RequestAttribute(name = "name") String name,
                         @SessionAttribute(name = "age") Integer age) {
        String oneUser = userService.getOneUser();
        System.out.println(oneUser + " show11 正在执行......." + name + " -" + age);
        return "/index.jsp";
    }

    @RequestMapping("show12")
    public String show12(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        String oneUser = userService.getOneUser();
        System.out.println(oneUser + " show12 正在执行......." + servletRequest + " -" + servletResponse);
        return "/index.jsp";
    }


}
