package com.gmall.user.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 会员收货地址表
 * 一个用户有多个收货地址,但是默认收货地址只有一个
 */
@Data
public class UmsMemberReceiveAddress {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  private String memberId;
  private String name;
  private String phoneNumber;
  /**1：默认收货地址    0：非默认收货地址*/
  private Integer defaultStatus;
  private String postCode;
  private String province;
  private String city;
  private String region;
  private String detailAddress;

}
