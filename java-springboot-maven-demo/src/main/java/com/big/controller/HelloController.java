package com.big.controller;

import com.big.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yin
 * @date 2024-10-17 10:46
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @Value("${person.name}")
    private String name;

    @Autowired
    private PersonDTO personDTO;

    @Autowired
    private Environment environment;

    @GetMapping("params")
    public void getParams() {
        System.out.println(name);
        System.out.println("------------");
        String property = environment.getProperty("person.age");
        System.out.println(property);
        System.out.println("------------");
        System.out.println(personDTO.getName() + personDTO.getAge());
    }
}
