package com.i9he.m2b.mapper;

import com.i9he.m2b.model.IMerchant;

public interface IMerchantMapper {
    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com usr_merchant
     *
     * @mbggenerated
     */
    int insert(IMerchant record);

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com usr_merchant
     *
     * @mbggenerated
     */
    int insertSelective(IMerchant record);

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com usr_merchant
     *
     * @mbggenerated
     */
    IMerchant selectByPrimaryKey(String merchantNo);

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com usr_merchant
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(IMerchant record);

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com usr_merchant
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(IMerchant record);
}