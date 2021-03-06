package com.i9he.m2b.model;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import java.math.BigDecimal;

public class JDPay implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.create_user_id
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.jdpay.createUserId.validation.notempty}")
	private Integer createUserId;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.create_time
	 * @mbggenerated
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.type
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.jdpay.type.validation.notempty}")
	private Byte type;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.order_id
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.jdpay.orderId.validation.notempty}")
	@Length(message = "{m2b.jdpay.orderId.validation.length}", max = 50)
	private String orderId;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.pay_state
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.jdpay.payState.validation.notempty}")
	private Byte payState;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.end_time
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.jdpay.endTime.validation.notempty}")
	private Date endTime;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.total_fee
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.jdpay.totalFee.validation.notempty}")
	private BigDecimal totalFee;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_oid
	 * @mbggenerated
	 */
	@Length(message = "{m2b.jdpay.vOid.validation.length}", max = 50)
	private String vOid;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_pmodeid
	 * @mbggenerated
	 */
	@Length(message = "{m2b.jdpay.vPmodeid.validation.length}", max = 50)
	private String vPmodeid;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_pmode
	 * @mbggenerated
	 */
	@Length(message = "{m2b.jdpay.vPmode.validation.length}", max = 50)
	private String vPmode;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_pstatus
	 * @mbggenerated
	 */
	@Length(message = "{m2b.jdpay.vPstatus.validation.length}", max = 50)
	private String vPstatus;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_pstring
	 * @mbggenerated
	 */
	@Length(message = "{m2b.jdpay.vPstring.validation.length}", max = 50)
	private String vPstring;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_amount
	 * @mbggenerated
	 */
	@Length(message = "{m2b.jdpay.vAmount.validation.length}", max = 50)
	private String vAmount;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_moneytype
	 * @mbggenerated
	 */
	@Length(message = "{m2b.jdpay.vMoneytype.validation.length}", max = 50)
	private String vMoneytype;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.remark1
	 * @mbggenerated
	 */
	@Length(message = "{m2b.jdpay.remark1.validation.length}", max = 50)
	private String remark1;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.remark2
	 * @mbggenerated
	 */
	@Length(message = "{m2b.jdpay.remark2.validation.length}", max = 50)
	private String remark2;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay
	 * @mbggenerated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.id
	 * @return  the value of b2b_pay_jdpay.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.id
	 * @param id  the value for b2b_pay_jdpay.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.create_user_id
	 * @return  the value of b2b_pay_jdpay.create_user_id
	 * @mbggenerated
	 */
	public Integer getCreateUserId() {
		return createUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.create_user_id
	 * @param createUserId  the value for b2b_pay_jdpay.create_user_id
	 * @mbggenerated
	 */
	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.create_time
	 * @return  the value of b2b_pay_jdpay.create_time
	 * @mbggenerated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.create_time
	 * @param createTime  the value for b2b_pay_jdpay.create_time
	 * @mbggenerated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.type
	 * @return  the value of b2b_pay_jdpay.type
	 * @mbggenerated
	 */
	public Byte getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.type
	 * @param type  the value for b2b_pay_jdpay.type
	 * @mbggenerated
	 */
	public void setType(Byte type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.order_id
	 * @return  the value of b2b_pay_jdpay.order_id
	 * @mbggenerated
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.order_id
	 * @param orderId  the value for b2b_pay_jdpay.order_id
	 * @mbggenerated
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId == null ? null : orderId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.pay_state
	 * @return  the value of b2b_pay_jdpay.pay_state
	 * @mbggenerated
	 */
	public Byte getPayState() {
		return payState;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.pay_state
	 * @param payState  the value for b2b_pay_jdpay.pay_state
	 * @mbggenerated
	 */
	public void setPayState(Byte payState) {
		this.payState = payState;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.end_time
	 * @return  the value of b2b_pay_jdpay.end_time
	 * @mbggenerated
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.end_time
	 * @param endTime  the value for b2b_pay_jdpay.end_time
	 * @mbggenerated
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.total_fee
	 * @return  the value of b2b_pay_jdpay.total_fee
	 * @mbggenerated
	 */
	public BigDecimal getTotalFee() {
		return totalFee;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.total_fee
	 * @param totalFee  the value for b2b_pay_jdpay.total_fee
	 * @mbggenerated
	 */
	public void setTotalFee(BigDecimal totalFee) {
		this.totalFee = totalFee;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_oid
	 * @return  the value of b2b_pay_jdpay.v_oid
	 * @mbggenerated
	 */
	public String getvOid() {
		return vOid;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_oid
	 * @param vOid  the value for b2b_pay_jdpay.v_oid
	 * @mbggenerated
	 */
	public void setvOid(String vOid) {
		this.vOid = vOid == null ? null : vOid.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_pmodeid
	 * @return  the value of b2b_pay_jdpay.v_pmodeid
	 * @mbggenerated
	 */
	public String getvPmodeid() {
		return vPmodeid;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_pmodeid
	 * @param vPmodeid  the value for b2b_pay_jdpay.v_pmodeid
	 * @mbggenerated
	 */
	public void setvPmodeid(String vPmodeid) {
		this.vPmodeid = vPmodeid == null ? null : vPmodeid.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_pmode
	 * @return  the value of b2b_pay_jdpay.v_pmode
	 * @mbggenerated
	 */
	public String getvPmode() {
		return vPmode;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_pmode
	 * @param vPmode  the value for b2b_pay_jdpay.v_pmode
	 * @mbggenerated
	 */
	public void setvPmode(String vPmode) {
		this.vPmode = vPmode == null ? null : vPmode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_pstatus
	 * @return  the value of b2b_pay_jdpay.v_pstatus
	 * @mbggenerated
	 */
	public String getvPstatus() {
		return vPstatus;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_pstatus
	 * @param vPstatus  the value for b2b_pay_jdpay.v_pstatus
	 * @mbggenerated
	 */
	public void setvPstatus(String vPstatus) {
		this.vPstatus = vPstatus == null ? null : vPstatus.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_pstring
	 * @return  the value of b2b_pay_jdpay.v_pstring
	 * @mbggenerated
	 */
	public String getvPstring() {
		return vPstring;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_pstring
	 * @param vPstring  the value for b2b_pay_jdpay.v_pstring
	 * @mbggenerated
	 */
	public void setvPstring(String vPstring) {
		this.vPstring = vPstring == null ? null : vPstring.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_amount
	 * @return  the value of b2b_pay_jdpay.v_amount
	 * @mbggenerated
	 */
	public String getvAmount() {
		return vAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_amount
	 * @param vAmount  the value for b2b_pay_jdpay.v_amount
	 * @mbggenerated
	 */
	public void setvAmount(String vAmount) {
		this.vAmount = vAmount == null ? null : vAmount.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_moneytype
	 * @return  the value of b2b_pay_jdpay.v_moneytype
	 * @mbggenerated
	 */
	public String getvMoneytype() {
		return vMoneytype;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.v_moneytype
	 * @param vMoneytype  the value for b2b_pay_jdpay.v_moneytype
	 * @mbggenerated
	 */
	public void setvMoneytype(String vMoneytype) {
		this.vMoneytype = vMoneytype == null ? null : vMoneytype.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.remark1
	 * @return  the value of b2b_pay_jdpay.remark1
	 * @mbggenerated
	 */
	public String getRemark1() {
		return remark1;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.remark1
	 * @param remark1  the value for b2b_pay_jdpay.remark1
	 * @mbggenerated
	 */
	public void setRemark1(String remark1) {
		this.remark1 = remark1 == null ? null : remark1.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.remark2
	 * @return  the value of b2b_pay_jdpay.remark2
	 * @mbggenerated
	 */
	public String getRemark2() {
		return remark2;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pay_jdpay.remark2
	 * @param remark2  the value for b2b_pay_jdpay.remark2
	 * @mbggenerated
	 */
	public void setRemark2(String remark2) {
		this.remark2 = remark2 == null ? null : remark2.trim();
	}
}