package com.i9he.m2b.model;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.Length;

public class BusinessTrusteeship implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.service_id
	 * @mbggenerated
	 */
	private Integer serviceId;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.trust_size
	 * @mbggenerated
	 */
	@NotEmpty(message = "{busi.businesstrusteeship.trustSize.validation.notempty}")
	private String trustSize;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.power
	 * @mbggenerated
	 */
	@NotEmpty(message = "{busi.businesstrusteeship.power.validation.notempty}")
	@Range(max = 12)
	@Length(max = 12, message = "{busi.businesstrusteeship.power.validation.length}")
	private String power;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.line
	 * @mbggenerated
	 */
	@NotEmpty(message = "{busi.businesstrusteeship.line.validation.notempty}")
	@Range(max = 15)
	@Length(max = 15, message = "{busi.businesstrusteeship.line.validation.length}")
	private String line;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.Server_id
	 * @mbggenerated
	 */
	@Range(max = 19)
	@Length(max = 19, message = "{busi.businesstrusteeship.serverId.validation.length}")
	private String serverId;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.bandwidth
	 * @mbggenerated
	 */
	private String bandwidth;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.Os_id
	 * @mbggenerated
	 */
	@Range(max = 19)
	@Length(max = 19, message = "{busi.businesstrusteeship.osId.validation.length}")
	private String osId;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.license_id
	 * @mbggenerated
	 */
	@Range(max = 19)
	@Length(max = 19, message = "{busi.businesstrusteeship.licenseId.validation.length}")
	private String licenseId;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.ip_count
	 * @mbggenerated
	 */
	@NotEmpty(message = "{busi.businesstrusteeship.ipCount.validation.notempty}")
	private Integer ipCount;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.created_date
	 * @mbggenerated
	 */
	@NotEmpty(message = "{busi.businesstrusteeship.createdDate.validation.notempty}")
	private Date createdDate;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.updated_date
	 * @mbggenerated
	 */
	private Date updatedDate;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.updated_by
	 * @mbggenerated
	 */
	private Integer updatedBy;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server
	 * @mbggenerated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.service_id
	 * @return  the value of busi_trusteeship_server.service_id
	 * @mbggenerated
	 */
	public Integer getServiceId() {
		return serviceId;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.service_id
	 * @param serviceId  the value for busi_trusteeship_server.service_id
	 * @mbggenerated
	 */
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.trust_size
	 * @return  the value of busi_trusteeship_server.trust_size
	 * @mbggenerated
	 */
	public String getTrustSize() {
		return trustSize;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.trust_size
	 * @param trustSize  the value for busi_trusteeship_server.trust_size
	 * @mbggenerated
	 */
	public void setTrustSize(String trustSize) {
		this.trustSize = trustSize== null ? null : trustSize.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.power
	 * @return  the value of busi_trusteeship_server.power
	 * @mbggenerated
	 */
	public String getPower() {
		return power;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.power
	 * @param power  the value for busi_trusteeship_server.power
	 * @mbggenerated
	 */
	public void setPower(String power) {
		this.power = power == null ? null : power.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.line
	 * @return  the value of busi_trusteeship_server.line
	 * @mbggenerated
	 */
	public String getLine() {
		return line;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.line
	 * @param line  the value for busi_trusteeship_server.line
	 * @mbggenerated
	 */
	public void setLine(String line) {
		this.line = line == null ? null : line.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.Server_id
	 * @return  the value of busi_trusteeship_server.Server_id
	 * @mbggenerated
	 */
	public String getServerId() {
		return serverId;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.Server_id
	 * @param serverId  the value for busi_trusteeship_server.Server_id
	 * @mbggenerated
	 */
	public void setServerId(String serverId) {
		this.serverId = serverId == null ? null : serverId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.bandwidth
	 * @return  the value of busi_trusteeship_server.bandwidth
	 * @mbggenerated
	 */
	public String getBandwidth() {
		return bandwidth;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.bandwidth
	 * @param bandwidth  the value for busi_trusteeship_server.bandwidth
	 * @mbggenerated
	 */
	public void setBandwidth(String bandwidth) {
		this.bandwidth = bandwidth == null?null:bandwidth.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.Os_id
	 * @return  the value of busi_trusteeship_server.Os_id
	 * @mbggenerated
	 */
	public String getOsId() {
		return osId;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.Os_id
	 * @param osId  the value for busi_trusteeship_server.Os_id
	 * @mbggenerated
	 */
	public void setOsId(String osId) {
		this.osId = osId == null ? null : osId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.license_id
	 * @return  the value of busi_trusteeship_server.license_id
	 * @mbggenerated
	 */
	public String getLicenseId() {
		return licenseId;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.license_id
	 * @param licenseId  the value for busi_trusteeship_server.license_id
	 * @mbggenerated
	 */
	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId == null ? null : licenseId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.ip_count
	 * @return  the value of busi_trusteeship_server.ip_count
	 * @mbggenerated
	 */
	public Integer getIpCount() {
		return ipCount;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.ip_count
	 * @param ipCount  the value for busi_trusteeship_server.ip_count
	 * @mbggenerated
	 */
	public void setIpCount(Integer ipCount) {
		this.ipCount = ipCount;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.created_date
	 * @return  the value of busi_trusteeship_server.created_date
	 * @mbggenerated
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.created_date
	 * @param createdDate  the value for busi_trusteeship_server.created_date
	 * @mbggenerated
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.updated_date
	 * @return  the value of busi_trusteeship_server.updated_date
	 * @mbggenerated
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.updated_date
	 * @param updatedDate  the value for busi_trusteeship_server.updated_date
	 * @mbggenerated
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.updated_by
	 * @return  the value of busi_trusteeship_server.updated_by
	 * @mbggenerated
	 */
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com busi_trusteeship_server.updated_by
	 * @param updatedBy  the value for busi_trusteeship_server.updated_by
	 * @mbggenerated
	 */
	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	private Integer orderId;
	private Integer state;
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId){
		this.orderId = orderId;
	}
	
	public Integer getState() {
		return state;
	}
	public void setState(Integer state){
		this.state = state;
	}
	
}