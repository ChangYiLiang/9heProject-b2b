package com.i9he.m2b.model;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Website implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.area_code
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.website.areaCode.validation.notempty}")
	@Length(message = "{m2b.website.areaCode.validation.length}", max = 50)
	private String areaCode;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.area_name
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.website.areaName.validation.notempty}")
	@Length(message = "{m2b.website.areaName.validation.length}", max = 50)
	private String areaName;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.remark
	 * @mbggenerated
	 */
	@Length(message = "{m2b.website.remark.validation.length}", max = 255)
	private String remark;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.create_time
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.website.createTime.validation.notempty}")
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.update_time
	 * @mbggenerated
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.update_user_id
	 * @mbggenerated
	 */
	private Integer updateUserId;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.content
	 * @mbggenerated
	 */
	private String content;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_website
	 * @mbggenerated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.id
	 * @return  the value of b2b_website.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.id
	 * @param id  the value for b2b_website.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.area_code
	 * @return  the value of b2b_website.area_code
	 * @mbggenerated
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.area_code
	 * @param areaCode  the value for b2b_website.area_code
	 * @mbggenerated
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode == null ? null : areaCode.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.area_name
	 * @return  the value of b2b_website.area_name
	 * @mbggenerated
	 */
	public String getAreaName() {
		return areaName;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.area_name
	 * @param areaName  the value for b2b_website.area_name
	 * @mbggenerated
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName == null ? null : areaName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.remark
	 * @return  the value of b2b_website.remark
	 * @mbggenerated
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.remark
	 * @param remark  the value for b2b_website.remark
	 * @mbggenerated
	 */
	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.create_time
	 * @return  the value of b2b_website.create_time
	 * @mbggenerated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.create_time
	 * @param createTime  the value for b2b_website.create_time
	 * @mbggenerated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.update_time
	 * @return  the value of b2b_website.update_time
	 * @mbggenerated
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.update_time
	 * @param updateTime  the value for b2b_website.update_time
	 * @mbggenerated
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.update_user_id
	 * @return  the value of b2b_website.update_user_id
	 * @mbggenerated
	 */
	public Integer getUpdateUserId() {
		return updateUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.update_user_id
	 * @param updateUserId  the value for b2b_website.update_user_id
	 * @mbggenerated
	 */
	public void setUpdateUserId(Integer updateUserId) {
		this.updateUserId = updateUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.content
	 * @return  the value of b2b_website.content
	 * @mbggenerated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_website.content
	 * @param content  the value for b2b_website.content
	 * @mbggenerated
	 */
	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}
	
	/*
	 * 扩展字段
	 */
	private String updateUsername;

	public String getUpdateUsername() {
		return updateUsername;
	}

	public void setUpdateUsername(String updateUsername) {
		this.updateUsername = updateUsername;
	}
	
}