package cn.baby_p2p.demo.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class TBid {

  private String id;
  private String borrowId;
  private String borrowTitle;
  private long bidAmount;
  private long bidInterest;
  private long yearRate;
  private long borrowState;
  private String bidUserId;
  private String bidUsername;
  private Date bidTime;
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


  public String getBorrowTitle() {
    return borrowTitle;
  }

  public void setBorrowTitle(String borrowTitle) {
    this.borrowTitle = borrowTitle;
  }


  public long getBidAmount() {
    return bidAmount;
  }

  public void setBidAmount(long bidAmount) {
    this.bidAmount = bidAmount;
  }


  public long getBidInterest() {
    return bidInterest;
  }

  public void setBidInterest(long bidInterest) {
    this.bidInterest = bidInterest;
  }


  public long getYearRate() {
    return yearRate;
  }

  public void setYearRate(long yearRate) {
    this.yearRate = yearRate;
  }


  public long getBorrowState() {
    return borrowState;
  }

  public void setBorrowState(long borrowState) {
    this.borrowState = borrowState;
  }


  public String getBidUserId() {
    return bidUserId;
  }

  public void setBidUserId(String bidUserId) {
    this.bidUserId = bidUserId;
  }


  public String getBidUsername() {
    return bidUsername;
  }

  public void setBidUsername(String bidUsername) {
    this.bidUsername = bidUsername;
  }


  public Date getBidTime() {
    return bidTime;
  }

  public void setBidTime(Date bidTime) {
    this.bidTime = bidTime;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}
