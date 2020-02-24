package cn.baby_p2p.demo.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class TUserWallet {

  private String accountId;
  private long availableAmount;
  private long freezeAmount;
  private long interestPending;
  private long principalPending;
  private long repaidAmount;
  private long creditScore;
  private long creditLine;
  private long residualCreditLine;
  private Date createTime;


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public long getAvailableAmount() {
    return availableAmount;
  }

  public void setAvailableAmount(long availableAmount) {
    this.availableAmount = availableAmount;
  }


  public long getFreezeAmount() {
    return freezeAmount;
  }

  public void setFreezeAmount(long freezeAmount) {
    this.freezeAmount = freezeAmount;
  }


  public long getInterestPending() {
    return interestPending;
  }

  public void setInterestPending(long interestPending) {
    this.interestPending = interestPending;
  }


  public long getPrincipalPending() {
    return principalPending;
  }

  public void setPrincipalPending(long principalPending) {
    this.principalPending = principalPending;
  }


  public long getRepaidAmount() {
    return repaidAmount;
  }

  public void setRepaidAmount(long repaidAmount) {
    this.repaidAmount = repaidAmount;
  }


  public long getCreditScore() {
    return creditScore;
  }

  public void setCreditScore(long creditScore) {
    this.creditScore = creditScore;
  }


  public long getCreditLine() {
    return creditLine;
  }

  public void setCreditLine(long creditLine) {
    this.creditLine = creditLine;
  }


  public long getResidualCreditLine() {
    return residualCreditLine;
  }

  public void setResidualCreditLine(long residualCreditLine) {
    this.residualCreditLine = residualCreditLine;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}
