package com.i9he.m2b.model;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class ZqUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_zq_user.user_code
     *
     * @mbggenerated
     */
    @Length(message = "{m2b.zquser.userCode.validation.length}", max = 20)
    private String userCode;

    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_zq_user.user_name
     *
     * @mbggenerated
     */
    @NotEmpty(message = "{m2b.zquser.userName.validation.notempty}")
    @Length(message = "{m2b.zquser.userName.validation.length}", max = 50)
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_zq_user.telephone_num
     *
     * @mbggenerated
     */
    @NotEmpty(message = "{m2b.zquser.telephoneNum.validation.notempty}")
    @Length(message = "{m2b.zquser.telephoneNum.validation.length}", max = 11)
    private String telephoneNum;

    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_zq_user.address
     *
     * @mbggenerated
     */
    @NotEmpty(message = "{m2b.zquser.address.validation.notempty}")
    @Length(message = "{m2b.zquser.address.validation.length}", max = 100)
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_zq_user.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_zq_user
     *
     * @mbggenerated
     */
    
    
    private String userType;
    
    private String province;
    
    private String city;
    
    private String idCard;
    
    private String id_card_scan_file1;
    
    private String id_card_scan_file2;
    
    private String scan_file;
    
    private String principal;
    
    private String  certificate;
    
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_zq_user.user_code
     *
     * @return the value of b2b_zq_user.user_code
     *
     * @mbggenerated
     */
    
    
    
    public String getUserCode() {
        return userCode;
    }

    public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getId_card_scan_file1() {
		return id_card_scan_file1;
	}

	public void setId_card_scan_file1(String id_card_scan_file1) {
		this.id_card_scan_file1 = id_card_scan_file1;
	}

	public String getId_card_scan_file2() {
		return id_card_scan_file2;
	}

	public void setId_card_scan_file2(String id_card_scan_file2) {
		this.id_card_scan_file2 = id_card_scan_file2;
	}

	public String getScan_file() {
		return scan_file;
	}

	public void setScan_file(String scan_file) {
		this.scan_file = scan_file;
	}

	/**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_zq_user.user_code
     *
     * @param userCode the value for b2b_zq_user.user_code
     *
     * @mbggenerated
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_zq_user.user_name
     *
     * @return the value of b2b_zq_user.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_zq_user.user_name
     *
     * @param userName the value for b2b_zq_user.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_zq_user.telephone_num
     *
     * @return the value of b2b_zq_user.telephone_num
     *
     * @mbggenerated
     */
    public String getTelephoneNum() {
        return telephoneNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_zq_user.telephone_num
     *
     * @param telephoneNum the value for b2b_zq_user.telephone_num
     *
     * @mbggenerated
     */
    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum == null ? null : telephoneNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_zq_user.address
     *
     * @return the value of b2b_zq_user.address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_zq_user.address
     *
     * @param address the value for b2b_zq_user.address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_zq_user.create_time
     *
     * @return the value of b2b_zq_user.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_zq_user.create_time
     *
     * @param createTime the value for b2b_zq_user.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}