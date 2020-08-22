package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {

    @RequestMapping(value = "/test0")
    public String test0(HttpServletRequest request) {
        ThreadLocal<Byte[]> localVariable = new ThreadLocal<Byte[]>();
        localVariable.set(new Byte[4096*1024]);// 为线程添加变量
        return "success";
    }
}
