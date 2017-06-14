package com.i9he.m2b.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Alipay implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.create_user_id
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.alipay.createUserId.validation.notempty}")
	private Integer createUserId;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.create_time
	 * @mbggenerated
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.type
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.alipay.type.validation.notempty}")
	private Byte type;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.order_id
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.alipay.orderId.validation.notempty}")
	@Length(message = "{m2b.alipay.orderId.validation.length}", max = 50)
	private String orderId;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.pay_state
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.alipay.payState.validation.notempty}")
	private Byte payState;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.end_time
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.alipay.endTime.validation.notempty}")
	private Date endTime;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.out_trade_no
	 * @mbggenerated
	 */
	@Length(message = "{m2b.alipay.outTradeNo.validation.length}", max = 50)
	private String outTradeNo;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.total_fee
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.alipay.totalFee.validation.notempty}")
	private BigDecimal totalFee;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.trade_no
	 * @mbggenerated
	 */
	@Length(message = "{m2b.alipay.tradeNo.validation.length}", max = 64)
	private String tradeNo;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.buyer_id
	 * @mbggenerated
	 */
	@Length(message = "{m2b.alipay.buyerId.validation.length}", max = 64)
	private String buyerId;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.buyer_mail
	 * @mbggenerated
	 */
	@Length(message = "{m2b.alipay.buyerMail.validation.length}", max = 64)
	private String buyerMail;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay
	 * @mbggenerated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.id
	 * @return  the value of b2b_pay_alipay.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.id
	 * @param id  the value for b2b_pay_alipay.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.create_user_id
	 * @return  the value of b2b_pay_alipay.create_user_id
	 * @mbggenerated
	 */
	public Integer getCreateUserId() {
		return createUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.create_user_id
	 * @param createUserId  the value for b2b_pay_alipay.create_user_id
	 * @mbggenerated
	 */
	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.create_time
	 * @return  the value of b2b_pay_alipay.create_time
	 * @mbggenerated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.create_time
	 * @param createTime  the value for b2b_pay_alipay.create_time
	 * @mbggenerated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.type
	 * @return  the value of b2b_pay_alipay.type
	 * @mbggenerated
	 */
	public Byte getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.type
	 * @param type  the value for b2b_pay_alipay.type
	 * @mbggenerated
	 */
	public void setType(Byte type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.order_id
	 * @return  the value of b2b_pay_alipay.order_id
	 * @mbggenerated
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.order_id
	 * @param orderId  the value for b2b_pay_alipay.order_id
	 * @mbggenerated
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId == null ? null : orderId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.pay_state
	 * @return  the value of b2b_pay_alipay.pay_state
	 * @mbggenerated
	 */
	public Byte getPayState() {
		return payState;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.pay_state
	 * @param payState  the value for b2b_pay_alipay.pay_state
	 * @mbggenerated
	 */
	public void setPayState(Byte payState) {
		this.payState = payState;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.end_time
	 * @return  the value of b2b_pay_alipay.end_time
	 * @mbggenerated
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.end_time
	 * @param endTime  the value for b2b_pay_alipay.end_time
	 * @mbggenerated
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.out_trade_no
	 * @return  the value of b2b_pay_alipay.out_trade_no
	 * @mbggenerated
	 */
	public String getOutTradeNo() {
		return outTradeNo;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.out_trade_no
	 * @param outTradeNo  the value for b2b_pay_alipay.out_trade_no
	 * @mbggenerated
	 */
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.total_fee
	 * @return  the value of b2b_pay_alipay.total_fee
	 * @mbggenerated
	 */
	public BigDecimal getTotalFee() {
		return totalFee;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.total_fee
	 * @param totalFee  the value for b2b_pay_alipay.total_fee
	 * @mbggenerated
	 */
	public void setTotalFee(BigDecimal totalFee) {
		this.totalFee = totalFee;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.trade_no
	 * @return  the value of b2b_pay_alipay.trade_no
	 * @mbggenerated
	 */
	public String getTradeNo() {
		return tradeNo;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.trade_no
	 * @param tradeNo  the value for b2b_pay_alipay.trade_no
	 * @mbggenerated
	 */
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo == null ? null : tradeNo.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.buyer_id
	 * @return  the value of b2b_pay_alipay.buyer_id
	 * @mbggenerated
	 */
	public String getBuyerId() {
		return buyerId;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.buyer_id
	 * @param buyerId  the value for b2b_pay_alipay.buyer_id
	 * @mbggenerated
	 */
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId == null ? null : buyerId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.buyer_mail
	 * @return  the value of b2b_pay_alipay.buyer_mail
	 * @mbggenerated
	 */
	public String getBuyerMail() {
		return buyerMail;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_alipay.buyer_mail
	 * @param buyerMail  the value for b2b_pay_alipay.buyer_mail
	 * @mbggenerated
	 */
	public void setBuyerMail(String buyerMail) {
		this.buyerMail = buyerMail == null ? null : buyerMail.trim();
	}
}