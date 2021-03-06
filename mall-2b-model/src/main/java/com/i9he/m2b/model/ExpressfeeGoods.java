package com.i9he.m2b.model;

import java.io.Serializable;
import org.hibernate.validator.constraints.NotEmpty;

public class ExpressfeeGoods implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_expressfee_goods.goods_id
	 * @mbggenerated
	 */
	private Integer goodsId;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_expressfee_goods.expressfee_template_id
	 * @mbggenerated
	 */
	private Integer expressfeeTemplateId;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_expressfee_goods.is_used
	 * @mbggenerated
	 */
	@NotEmpty(message = "{m2b.expressfeegoods.isUsed.validation.notempty}")
	private Integer isUsed;
	/**
	 * This field was generated by MyBatis Generator. copyright @ www.9he.com b2b_expressfee_goods
	 * @mbggenerated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_expressfee_goods.goods_id
	 * @return  the value of b2b_expressfee_goods.goods_id
	 * @mbggenerated
	 */
	public Integer getGoodsId() {
		return goodsId;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_expressfee_goods.goods_id
	 * @param goodsId  the value for b2b_expressfee_goods.goods_id
	 * @mbggenerated
	 */
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_expressfee_goods.expressfee_template_id
	 * @return  the value of b2b_expressfee_goods.expressfee_template_id
	 * @mbggenerated
	 */
	public Integer getExpressfeeTemplateId() {
		return expressfeeTemplateId;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_expressfee_goods.expressfee_template_id
	 * @param expressfeeTemplateId  the value for b2b_expressfee_goods.expressfee_template_id
	 * @mbggenerated
	 */
	public void setExpressfeeTemplateId(Integer expressfeeTemplateId) {
		this.expressfeeTemplateId = expressfeeTemplateId;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_expressfee_goods.is_used
	 * @return  the value of b2b_expressfee_goods.is_used
	 * @mbggenerated
	 */
	public Integer getIsUsed() {
		return isUsed;
	}

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_expressfee_goods.is_used
	 * @param isUsed  the value for b2b_expressfee_goods.is_used
	 * @mbggenerated
	 */
	public void setIsUsed(Integer isUsed) {
		this.isUsed = isUsed;
	}
}