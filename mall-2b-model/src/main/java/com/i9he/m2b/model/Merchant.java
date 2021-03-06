package com.i9he.m2b.model;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Merchant implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.merchant_no
	 * @mbggenerated
	 */
	@Length(message = "{m2b.merchant.merchantNo.validation.length}", max = 15)
	private String merchantNo;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.mail_name
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.merchant.mailName.validation.notempty}")
	@Length(message = "{m2b.merchant.mailName.validation.length}", max = 100)
	private String mailName;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.category
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.merchant.category.validation.notempty}")
	private Byte category;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.type
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.merchant.type.validation.notempty}")
	private Byte type;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.corporate
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.merchant.corporate.validation.notempty}")
	@Length(message = "{m2b.merchant.corporate.validation.length}", max = 50)
	private String corporate;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.org_code
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.merchant.orgCode.validation.notempty}")
	@Length(message = "{m2b.merchant.orgCode.validation.length}", max = 15)
	private String orgCode;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.name
	 * @mbggenerated
	 */
	@Length(message = "{m2b.merchant.name.validation.length}", max = 50)
	private String name;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.phone
	 * @mbggenerated
	 */
	@Length(message = "{m2b.merchant.phone.validation.length}", max = 50)
	private String phone;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.reg_date
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.merchant.regDate.validation.notempty}")
	private Date regDate;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.update_date
	 * @mbggenerated
	 */
	private Date updateDate;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant
	 * @mbggenerated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.merchant_no
	 * @return  the value of usr_merchant.merchant_no
	 * @mbggenerated
	 */
	public String getMerchantNo() {
		return merchantNo;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.merchant_no
	 * @param merchantNo  the value for usr_merchant.merchant_no
	 * @mbggenerated
	 */
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo == null ? null : merchantNo.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.mail_name
	 * @return  the value of usr_merchant.mail_name
	 * @mbggenerated
	 */
	public String getMailName() {
		return mailName;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.mail_name
	 * @param mailName  the value for usr_merchant.mail_name
	 * @mbggenerated
	 */
	public void setMailName(String mailName) {
		this.mailName = mailName == null ? null : mailName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.category
	 * @return  the value of usr_merchant.category
	 * @mbggenerated
	 */
	public Byte getCategory() {
		return category;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.category
	 * @param category  the value for usr_merchant.category
	 * @mbggenerated
	 */
	public void setCategory(Byte category) {
		this.category = category;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.type
	 * @return  the value of usr_merchant.type
	 * @mbggenerated
	 */
	public Byte getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.type
	 * @param type  the value for usr_merchant.type
	 * @mbggenerated
	 */
	public void setType(Byte type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.corporate
	 * @return  the value of usr_merchant.corporate
	 * @mbggenerated
	 */
	public String getCorporate() {
		return corporate;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.corporate
	 * @param corporate  the value for usr_merchant.corporate
	 * @mbggenerated
	 */
	public void setCorporate(String corporate) {
		this.corporate = corporate == null ? null : corporate.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.org_code
	 * @return  the value of usr_merchant.org_code
	 * @mbggenerated
	 */
	public String getOrgCode() {
		return orgCode;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.org_code
	 * @param orgCode  the value for usr_merchant.org_code
	 * @mbggenerated
	 */
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode == null ? null : orgCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.name
	 * @return  the value of usr_merchant.name
	 * @mbggenerated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.name
	 * @param name  the value for usr_merchant.name
	 * @mbggenerated
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.phone
	 * @return  the value of usr_merchant.phone
	 * @mbggenerated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.phone
	 * @param phone  the value for usr_merchant.phone
	 * @mbggenerated
	 */
	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.reg_date
	 * @return  the value of usr_merchant.reg_date
	 * @mbggenerated
	 */
	public Date getRegDate() {
		return regDate;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.reg_date
	 * @param regDate  the value for usr_merchant.reg_date
	 * @mbggenerated
	 */
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.update_date
	 * @return  the value of usr_merchant.update_date
	 * @mbggenerated
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com usr_merchant.update_date
	 * @param updateDate  the value for usr_merchant.update_date
	 * @mbggenerated
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}