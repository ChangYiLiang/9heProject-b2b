package com.i9he.m2b.mapper;

import java.util.List;

import com.i9he.m2b.model.SeoParams;

public interface SeoParamsMapper {
    /**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo_params
	 * @mbggenerated
	 */
	int insert(SeoParams record);

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo_params
	 * @mbggenerated
	 */
	int insertSelective(SeoParams record);

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo_params
	 * @mbggenerated
	 */
	SeoParams selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo_params
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(SeoParams record);

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_seo_params
	 * @mbggenerated
	 */
	int updateByPrimaryKey(SeoParams record);

	int deleteByPrimaryKey(Integer id);
    
    List<SeoParams> selectBySeoId(Integer seoId);
}