package cn.baby_p2p.demo.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class TRecharge {

  private String id;
  private String userId;
  private String username;
  private String bankCardId;
  private String tradeNo;
  private long amount;
  private Date rechargeTime;
  private long state;
  private String remark;
  private Date createTime;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getBankCardId() {
    return bankCardId;
  }

  public void setBankCardId(String bankCardId) {
    this.bankCardId = bankCardId;
  }


  public String getTradeNo() {
    return tradeNo;
  }

  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }


  public long getAmount() {
    return amount;
  }

  public void setAmount(long amount) {
    this.amount = amount;
  }


  public Date getRechargeTime() {
    return rechargeTime;
  }

  public void setRechargeTime(Date rechargeTime) {
    this.rechargeTime = rechargeTime;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}
