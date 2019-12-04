package com.atguigu.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.mapper.MemberReceiveAddressMapper;
import com.atguigu.gmall.mapper.UserMapper;
import com.atguigu.gmall.service.UserServiceIfc;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @program: gmall0105
 * @Date: 2019/12/2 12:24
 * @Author: Inxu
 * @Description:
 */
@Service
public class UserServiceImpl implements UserServiceIfc {
    @Autowired
    private  UserMapper userMapper;

    @Autowired
    private MemberReceiveAddressMapper receiveAddressMapper;
    @Override
    public List<UmsMember> getAll() {

        return userMapper.selectAll();
    }

    @Override
    public UmsMember getUser(String id) {
        Example example = new Example(UmsMember.class);
        example.createCriteria().andEqualTo("id",id);
        return userMapper.selectOneByExample(example);
    }
    @Override
    public UmsMemberReceiveAddress getDefaultAddr(String memberId) {
        Example e = new Example(UmsMemberReceiveAddress.class);
        Example.Criteria criteria = e.createCriteria();
        criteria.andEqualTo("memberId",memberId);
        criteria.andEqualTo("defaultStatus",1);
        return receiveAddressMapper.selectOneByExample(e);
    }

    @Override
    public List<UmsMemberReceiveAddress> getReAddr(String memberId) {
        Example e = new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> addresses = receiveAddressMapper.selectByExample(e);
        System.out.println("addresses="+addresses.size());
        return addresses;
    }
}
