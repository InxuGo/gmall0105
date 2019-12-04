package com.atguigu.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.service.UserServiceIfc;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: gmall0105
 * @Date: 2019/12/2 12:21
 * @Author: Inxu
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Reference
    private UserServiceIfc userServiceIfc;

    @RequestMapping("/all")
    public List<UmsMember> getUserList(){
        return  userServiceIfc.getAll();
    }
    @RequestMapping("/one/{id}")
    public UmsMember getUser(@PathVariable String id){
        return  userServiceIfc.getUser(id);
    }

    @RequestMapping("/addr/{memberId}")
    public List<UmsMemberReceiveAddress> getDefaultAddress(@PathVariable() String memberId){
        return  userServiceIfc.getReAddr(memberId);
    }
}
