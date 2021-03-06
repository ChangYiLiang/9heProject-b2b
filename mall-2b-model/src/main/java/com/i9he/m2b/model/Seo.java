package com.i9he.m2b.model;

import java.io.Serializable;
import java.util.Date;
import org.hibernate.validator.constraints.Length;

public class Seo implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.id
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.name
	 * @mbggenerated
	 */
	@Length(message = "{m2b.seo.name.validation.length}", max = 50)
	private String name;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.url
	 * @mbggenerated
	 */
	@Length(message = "{m2b.seo.url.validation.length}", max = 255)
	private String url;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.category
	 * @mbggenerated
	 */
	@Length(message = "{m2b.seo.category.validation.length}", max = 50)
	private String category;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.title
	 * @mbggenerated
	 */
	@Length(message = "{m2b.seo.title.validation.length}", max = 255)
	private String title;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.keyword
	 * @mbggenerated
	 */
	@Length(message = "{m2b.seo.keyword.validation.length}", max = 255)
	private String keyword;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.description
	 * @mbggenerated
	 */
	@Length(message = "{m2b.seo.description.validation.length}", max = 255)
	private String description;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.modify_time
	 * @mbggenerated
	 */
	private Date modifyTime;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo
	 * @mbggenerated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.id
	 * @return  the value of b2b_seo.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.id
	 * @param id  the value for b2b_seo.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.name
	 * @return  the value of b2b_seo.name
	 * @mbggenerated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.name
	 * @param name  the value for b2b_seo.name
	 * @mbggenerated
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.url
	 * @return  the value of b2b_seo.url
	 * @mbggenerated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.url
	 * @param url  the value for b2b_seo.url
	 * @mbggenerated
	 */
	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.category
	 * @return  the value of b2b_seo.category
	 * @mbggenerated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.category
	 * @param category  the value for b2b_seo.category
	 * @mbggenerated
	 */
	public void setCategory(String category) {
		this.category = category == null ? null : category.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.title
	 * @return  the value of b2b_seo.title
	 * @mbggenerated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.title
	 * @param title  the value for b2b_seo.title
	 * @mbggenerated
	 */
	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.keyword
	 * @return  the value of b2b_seo.keyword
	 * @mbggenerated
	 */
	public String getKeyword() {
		return keyword;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.keyword
	 * @param keyword  the value for b2b_seo.keyword
	 * @mbggenerated
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword == null ? null : keyword.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.description
	 * @return  the value of b2b_seo.description
	 * @mbggenerated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.description
	 * @param description  the value for b2b_seo.description
	 * @mbggenerated
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.modify_time
	 * @return  the value of b2b_seo.modify_time
	 * @mbggenerated
	 */
	public Date getModifyTime() {
		return modifyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo.modify_time
	 * @param modifyTime  the value for b2b_seo.modify_time
	 * @mbggenerated
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
}