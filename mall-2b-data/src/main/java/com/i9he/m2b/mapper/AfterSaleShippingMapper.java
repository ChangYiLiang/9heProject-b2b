package com.i9he.m2b.mapper;

import java.util.List;

import com.i9he.m2b.model.AfterSaleShipping;

public interface AfterSaleShippingMapper {

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_ord_after_sale_shipping
	 * @mbggenerated
	 */
	int insert(AfterSaleShipping record);

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_ord_after_sale_shipping
	 * @mbggenerated
	 */
	int insertSelective(AfterSaleShipping record);

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_ord_after_sale_shipping
	 * @mbggenerated
	 */
	AfterSaleShipping selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_ord_after_sale_shipping
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(AfterSaleShipping record);

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_ord_after_sale_shipping
	 * @mbggenerated
	 */
	int updateByPrimaryKey(AfterSaleShipping record);

	List<AfterSaleShipping> selectByAfterSaleId(Integer afterSaleId);
}