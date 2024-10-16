package com.big.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.FileNotFoundException;

/**
 *
 * 全局异常处理类
 * @author Yin
 * @date 2024-10-16 14:37
 */
@RestControllerAdvice
public class CommonExceptionController {

    @ExceptionHandler(FileNotFoundException.class)
    public String fileNotFound() {
        return "文件未找到";
    }

}
