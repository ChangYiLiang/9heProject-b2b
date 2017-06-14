package com.i9he.m2b.mapper;

import com.i9he.m2b.model.ExpressAddress;

public interface ExpressAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_express_address
     *
     * @mbggenerated
     */
    int insert(ExpressAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_express_address
     *
     * @mbggenerated
     */
    int insertSelective(ExpressAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_express_address
     *
     * @mbggenerated
     */
    ExpressAddress selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_express_address
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ExpressAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_express_address
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ExpressAddress record);

    /***
     * 根据计费方式id查寄送地址
     * @param id
     * @return
     */
	public ExpressAddress selectAddressListByTypeId(Integer expressfeeTypeId);

	public Integer deleteById(Integer id);
}