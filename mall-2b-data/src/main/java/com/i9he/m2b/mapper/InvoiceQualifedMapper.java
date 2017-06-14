package com.i9he.m2b.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.i9he.m2b.model.InvoiceQualifed;
import com.i9he.m2b.model.PurchaseRequirement;
import com.i9he.m2b.model.search.InvoiceQualifedSearchModel;

public interface InvoiceQualifedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice_qualifed
     *
     * @mbggenerated
     */
    int insert(InvoiceQualifed record);

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice_qualifed
     *
     * @mbggenerated
     */
    int insertSelective(InvoiceQualifed record);

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice_qualifed
     *
     * @mbggenerated
     */
    InvoiceQualifed selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice_qualifed
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(InvoiceQualifed record);

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_invoice_qualifed
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(InvoiceQualifed record);
    
    /***
     * 条件查询增票资质申请
     */
    public List<InvoiceQualifed> selectBySearchModel(InvoiceQualifedSearchModel searchModel,RowBounds rowBounds);
    
    public Integer selectCountBySearchModel(InvoiceQualifedSearchModel searchModel);

    InvoiceQualifed findByUserId(Integer userId);
}