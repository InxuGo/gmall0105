package com.gmall.user.service;

import com.gmall.user.entity.UmsMember;
import com.gmall.user.entity.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @program: gmall0105
 * @Date: 2019/12/2 12:23
 * @Author: Inxu
 * @Description:
 */
public interface UserServiceIfc {
    /**
     * 查询所有的会员
     * @return List<UmsMember>
     */
    List<UmsMember> getAll();
    /**
     *
     */
    UmsMember getUser(String id);

    /**
     * 根据会员ID查询默认的收货地址
     * @param memberId
     * @return  UmsMemberReceiveAddress
     */
    UmsMemberReceiveAddress getDefaultAddr(String memberId);

    /**
     * 根据会员ID查询所有的守护地址
     * @param memberId
     * @return  List<UmsMemberReceiveAddress>
     */
    List<UmsMemberReceiveAddress> getReAddr(String memberId);

}
