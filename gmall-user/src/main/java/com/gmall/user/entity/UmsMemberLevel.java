package com.gmall.user.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 会员等级表
 */
@Data
public class UmsMemberLevel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  private String name;
  private long growthPoint;
  private long defaultStatus;
  private double freeFreightPoint;
  private long commentGrowthPoint;
  private long priviledgeFreeFreight;
  private long priviledgeSignIn;
  private long priviledgeComment;
  private long priviledgePromotion;
  private long priviledgeMemberPrice;
  private long priviledgeBirthday;
  private String note;


}
