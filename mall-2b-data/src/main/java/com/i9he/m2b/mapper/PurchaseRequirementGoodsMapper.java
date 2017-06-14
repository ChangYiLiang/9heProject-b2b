package com.i9he.m2b.mapper;

import java.util.List;

import com.i9he.m2b.model.PurchaseRequirementGoods;

public interface PurchaseRequirementGoodsMapper {

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pur_requirement_goods
	 * @mbggenerated
	 */
	int insert(PurchaseRequirementGoods record);

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pur_requirement_goods
	 * @mbggenerated
	 */
	int insertSelective(PurchaseRequirementGoods record);

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pur_requirement_goods
	 * @mbggenerated
	 */
	PurchaseRequirementGoods selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pur_requirement_goods
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(PurchaseRequirementGoods record);

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_pur_requirement_goods
	 * @mbggenerated
	 */
	int updateByPrimaryKey(PurchaseRequirementGoods record);

	/**
	 * 新增: By Jimmy 2016-12-02
	 */
	public List<PurchaseRequirementGoods> selectByRequirementId(Integer requirementId);
}