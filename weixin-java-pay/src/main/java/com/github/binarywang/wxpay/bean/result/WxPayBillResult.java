package com.github.binarywang.wxpay.bean.result;

import java.io.Serializable;
import java.util.List;

public class WxPayBillResult implements Serializable {
  /**
   * 对账返回对象
   */
  private static final long serialVersionUID = 1L;

  private List<WxPayBillBaseResult> wxPayBillBaseResultLst;
  /**
   * 总交易单数
   */
  private String totalRecord;
  /**
   * 总交易额
   */
  private String totalFee;
  /**
   * 总退款金额
   */
  private String totalRefundFee;
  /**
   * 总代金券或立减优惠退款金额
   */
  private String totalCouponFee;
  /**
   * 手续费总金额
   */
  private String totalPoundageFee;

  public List<WxPayBillBaseResult> getWxPayBillBaseResultLst() {
    return wxPayBillBaseResultLst;
  }

  public void setWxPayBillBaseResultLst(List<WxPayBillBaseResult> wxPayBillBaseResultLst) {
    this.wxPayBillBaseResultLst = wxPayBillBaseResultLst;
  }

  public String getTotalRecord() {
    return totalRecord;
  }

  public void setTotalRecord(String totalRecord) {
    this.totalRecord = totalRecord;
  }

  public String getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(String totalFee) {
    this.totalFee = totalFee;
  }

  public String getTotalRefundFee() {
    return totalRefundFee;
  }

  public void setTotalRefundFee(String totalRefundFee) {
    this.totalRefundFee = totalRefundFee;
  }

  public String getTotalCouponFee() {
    return totalCouponFee;
  }

  public void setTotalCouponFee(String totalCouponFee) {
    this.totalCouponFee = totalCouponFee;
  }

  public String getTotalPoundageFee() {
    return totalPoundageFee;
  }

  public void setTotalPoundageFee(String totalPoundageFee) {
    this.totalPoundageFee = totalPoundageFee;
  }


}
