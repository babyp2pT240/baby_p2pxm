package cn.baby_p2p.demo.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class TUserInfo {

  private String accountId;
  private String avatar;
  private String realname;
  private String idCardNumber;
  private String phoneNumber;
  private long incomeLevelId;
  private long marriageId;
  private long eduBackgroundId;
  private long houseConditionId;
  private Date createTime;


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }


  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }


  public String getIdCardNumber() {
    return idCardNumber;
  }

  public void setIdCardNumber(String idCardNumber) {
    this.idCardNumber = idCardNumber;
  }


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public long getIncomeLevelId() {
    return incomeLevelId;
  }

  public void setIncomeLevelId(long incomeLevelId) {
    this.incomeLevelId = incomeLevelId;
  }


  public long getMarriageId() {
    return marriageId;
  }

  public void setMarriageId(long marriageId) {
    this.marriageId = marriageId;
  }


  public long getEduBackgroundId() {
    return eduBackgroundId;
  }

  public void setEduBackgroundId(long eduBackgroundId) {
    this.eduBackgroundId = eduBackgroundId;
  }


  public long getHouseConditionId() {
    return houseConditionId;
  }

  public void setHouseConditionId(long houseConditionId) {
    this.houseConditionId = houseConditionId;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}
