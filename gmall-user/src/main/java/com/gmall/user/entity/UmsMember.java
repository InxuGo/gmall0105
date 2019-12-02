package com.gmall.user.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 用户会员表
 */
@Data
public class UmsMember {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  private long memberLevelId;
  private String username;
  private String password;
  private String nickname;
  private String phone;
  private long status;
  private Date createTime;
  private String icon;
  private long gender;
  private Date birthday;
  private String city;
  private String job;
  private String personalizedSignature;
  private long sourceType;
  private long integration;
  private long growth;
  private long luckeyCount;
  private long historyIntegration;


}
