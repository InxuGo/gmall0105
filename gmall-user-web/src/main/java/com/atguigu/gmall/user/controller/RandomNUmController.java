package com.atguigu.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.service.UserServiceIfc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: gmall0105
 * @Date: 2019/12/4 21:15
 * @Author: Inxu
 * @Description:
 */
@Controller
public class RandomNUmController {
    @Reference
    private  UserServiceIfc userServiceIfc;
    @RequestMapping("/get")
    public String getStr(){
        return  "";
    }
}
