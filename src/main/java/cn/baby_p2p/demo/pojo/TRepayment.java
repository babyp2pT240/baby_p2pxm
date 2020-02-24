package cn.baby_p2p.demo.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class TRepayment {

  private String id;
  private String borrowId;
  private String borrowUserId;
  private String borrowTitle;
  private Date deadline;
  private Date repaymentTime;
  private long totalAmount;
  private long principal;
  private long interest;
  private long period;
  private long state;
  private long borrowType;
  private long repaymentType;
  private Date createTime;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getBorrowId() {
    return borrowId;
  }

  public void setBorrowId(String borrowId) {
    this.borrowId = borrowId;
  }


  public String getBorrowUserId() {
    return borrowUserId;
  }

  public void setBorrowUserId(String borrowUserId) {
    this.borrowUserId = borrowUserId;
  }


  public String getBorrowTitle() {
    return borrowTitle;
  }

  public void setBorrowTitle(String borrowTitle) {
    this.borrowTitle = borrowTitle;
  }


  public Date getDeadline() {
    return deadline;
  }

  public void setDeadline(Date deadline) {
    this.deadline = deadline;
  }


  public Date getRepaymentTime() {
    return repaymentTime;
  }

  public void setRepaymentTime(Date repaymentTime) {
    this.repaymentTime = repaymentTime;
  }


  public long getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(long totalAmount) {
    this.totalAmount = totalAmount;
  }


  public long getPrincipal() {
    return principal;
  }

  public void setPrincipal(long principal) {
    this.principal = principal;
  }


  public long getInterest() {
    return interest;
  }

  public void setInterest(long interest) {
    this.interest = interest;
  }


  public long getPeriod() {
    return period;
  }

  public void setPeriod(long period) {
    this.period = period;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }


  public long getBorrowType() {
    return borrowType;
  }

  public void setBorrowType(long borrowType) {
    this.borrowType = borrowType;
  }


  public long getRepaymentType() {
    return repaymentType;
  }

  public void setRepaymentType(long repaymentType) {
    this.repaymentType = repaymentType;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}
