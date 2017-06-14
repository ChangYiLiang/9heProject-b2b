package com.i9he.m2b.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.i9he.m2b.model.Contract;
import com.i9he.m2b.model.ZqUser;
import com.i9he.m2b.model.search.ZqSearchModel;
import com.i9he.m2b.model.search.ZqUserSearchModel;

public interface ContractMapper {
    /**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_contract
	 * @mbggenerated
	 */
	int insert(Contract record);

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_contract
	 * @mbggenerated
	 */
	int insertSelective(Contract record);

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_contract
	 * @mbggenerated
	 */
	Contract selectByPrimaryKey(String contractNum);

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_contract
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Contract record);

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_contract
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Contract record);

	List<Contract> getListByUserId(@Param("userId")Integer userId);
	
	List<Contract> getAll(RowBounds rs,ZqSearchModel zsm);
	
	int  getCount(ZqSearchModel zsm);
}