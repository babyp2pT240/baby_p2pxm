package cn.baby_p2p.demo.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class TRepaymentDetail {

  private String id;
  private String bidId;
  private String borrowId;
  private String repaymentId;
  private String borrowUserId;
  private String bidUserId;
  private String borrowTitle;
  private long totalAmount;
  private long principal;
  private long interest;
  private long period;
  private Date deadline;
  private Date repaymentTime;
  private long repaymentType;
  private Date createTime;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getBidId() {
    return bidId;
  }

  public void setBidId(String bidId) {
    this.bidId = bidId;
  }


  public String getBorrowId() {
    return borrowId;
  }

  public void setBorrowId(String borrowId) {
    this.borrowId = borrowId;
  }


  public String getRepaymentId() {
    return repaymentId;
  }

  public void setRepaymentId(String repaymentId) {
    this.repaymentId = repaymentId;
  }


  public String getBorrowUserId() {
    return borrowUserId;
  }

  public void setBorrowUserId(String borrowUserId) {
    this.borrowUserId = borrowUserId;
  }


  public String getBidUserId() {
    return bidUserId;
  }

  public void setBidUserId(String bidUserId) {
    this.bidUserId = bidUserId;
  }


  public String getBorrowTitle() {
    return borrowTitle;
  }

  public void setBorrowTitle(String borrowTitle) {
    this.borrowTitle = borrowTitle;
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
