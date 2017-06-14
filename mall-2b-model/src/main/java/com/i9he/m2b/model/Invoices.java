package com.i9he.m2b.model;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Invoices implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.type
     *
     * @mbggenerated
     */
    @NotEmpty(message = "{m2b.invoices.type.validation.notempty}")
    private Integer type;
    
    private Integer state;
    

    public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	/**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.user_id
     *
     * @mbggenerated
     */
    @NotEmpty(message = "{m2b.invoices.userId.validation.notempty}")
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.order_id
     *
     * @mbggenerated
     */
    @NotEmpty(message = "{m2b.invoices.orderId.validation.notempty}")
    private Integer orderId;

    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.organization
     *
     * @mbggenerated
     */
    @Length(message = "{m2b.invoices.organization.validation.length}", max = 50)
    private String organization;

    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.user_idcode
     *
     * @mbggenerated
     */
    @Length(message = "{m2b.invoices.userIdcode.validation.length}", max = 50)
    private String userIdcode;

    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.regist_address
     *
     * @mbggenerated
     */
    @Length(message = "{m2b.invoices.registAddress.validation.length}", max = 255)
    private String registAddress;

    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.regist_phone
     *
     * @mbggenerated
     */
    @Length(message = "{m2b.invoices.registPhone.validation.length}", max = 30)
    private String registPhone;

    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.bank
     *
     * @mbggenerated
     */
    @Length(message = "{m2b.invoices.bank.validation.length}", max = 30)
    private String bank;

    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.bank_account
     *
     * @mbggenerated
     */
    @Length(message = "{m2b.invoices.bankAccount.validation.length}", max = 50)
    private String bankAccount;

    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.header
     *
     * @mbggenerated
     */
    @Length(message = "{m2b.invoices.header.validation.length}", max = 30)
    private String header;

    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.content
     *
     * @mbggenerated
     */
    @Length(message = "{m2b.invoices.content.validation.length}", max = 30)
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.remark
     *
     * @mbggenerated
     */
    @Length(message = "{m2b.invoices.remark.validation.length}", max = 255)
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.created_time
     *
     * @mbggenerated
     */
    private Date createdTime;
    
    private String userName;

    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.id
     *
     * @return the value of b2b_invoice.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.id
     *
     * @param id the value for b2b_invoice.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.type
     *
     * @return the value of b2b_invoice.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.type
     *
     * @param type the value for b2b_invoice.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.user_id
     *
     * @return the value of b2b_invoice.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.user_id
     *
     * @param userId the value for b2b_invoice.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.order_id
     *
     * @return the value of b2b_invoice.order_id
     *
     * @mbggenerated
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.order_id
     *
     * @param orderId the value for b2b_invoice.order_id
     *
     * @mbggenerated
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.organization
     *
     * @return the value of b2b_invoice.organization
     *
     * @mbggenerated
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.organization
     *
     * @param organization the value for b2b_invoice.organization
     *
     * @mbggenerated
     */
    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.user_idcode
     *
     * @return the value of b2b_invoice.user_idcode
     *
     * @mbggenerated
     */
    public String getUserIdcode() {
        return userIdcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.user_idcode
     *
     * @param userIdcode the value for b2b_invoice.user_idcode
     *
     * @mbggenerated
     */
    public void setUserIdcode(String userIdcode) {
        this.userIdcode = userIdcode == null ? null : userIdcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.regist_address
     *
     * @return the value of b2b_invoice.regist_address
     *
     * @mbggenerated
     */
    public String getRegistAddress() {
        return registAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.regist_address
     *
     * @param registAddress the value for b2b_invoice.regist_address
     *
     * @mbggenerated
     */
    public void setRegistAddress(String registAddress) {
        this.registAddress = registAddress == null ? null : registAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.regist_phone
     *
     * @return the value of b2b_invoice.regist_phone
     *
     * @mbggenerated
     */
    public String getRegistPhone() {
        return registPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.regist_phone
     *
     * @param registPhone the value for b2b_invoice.regist_phone
     *
     * @mbggenerated
     */
    public void setRegistPhone(String registPhone) {
        this.registPhone = registPhone == null ? null : registPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.bank
     *
     * @return the value of b2b_invoice.bank
     *
     * @mbggenerated
     */
    public String getBank() {
        return bank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.bank
     *
     * @param bank the value for b2b_invoice.bank
     *
     * @mbggenerated
     */
    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.bank_account
     *
     * @return the value of b2b_invoice.bank_account
     *
     * @mbggenerated
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.bank_account
     *
     * @param bankAccount the value for b2b_invoice.bank_account
     *
     * @mbggenerated
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.header
     *
     * @return the value of b2b_invoice.header
     *
     * @mbggenerated
     */
    public String getHeader() {
        return header;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.header
     *
     * @param header the value for b2b_invoice.header
     *
     * @mbggenerated
     */
    public void setHeader(String header) {
        this.header = header == null ? null : header.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.content
     *
     * @return the value of b2b_invoice.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.content
     *
     * @param content the value for b2b_invoice.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.remark
     *
     * @return the value of b2b_invoice.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.remark
     *
     * @param remark the value for b2b_invoice.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.created_time
     *
     * @return the value of b2b_invoice.created_time
     *
     * @mbggenerated
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice.created_time
     *
     * @param createdTime the value for b2b_invoice.created_time
     *
     * @mbggenerated
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}