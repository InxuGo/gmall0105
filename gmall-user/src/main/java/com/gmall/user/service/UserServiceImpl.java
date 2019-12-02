package com.gmall.user.service;

import com.gmall.user.entity.UmsMember;
import com.gmall.user.entity.UmsMemberReceiveAddress;
import com.gmall.user.mapper.MemberReceiveAddressMapper;
import com.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @program: gmall0105
 * @Date: 2019/12/2 12:24
 * @Author: Inxu
 * @Description:
 */
@Service("userServiceImpl")
public class UserServiceImpl  implements  UserServiceIfc{
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
        //UmsMemberReceiveAddress address = new UmsMemberReceiveAddress();
        //address.setMemberId(memberId);
        List<UmsMemberReceiveAddress> addresses = receiveAddressMapper.selectByExample(e);
        System.out.println("addresses="+addresses.size());
        return addresses;
    }
}
