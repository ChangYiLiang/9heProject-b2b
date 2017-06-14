package com.i9he.m2b.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.i9he.m2b.model.Tag;
import com.i9he.m2b.model.search.TagSearchModel;

public interface TagMapper {
    /**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_tag
	 * @mbggenerated
	 */
	int insert(Tag record);

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_tag
	 * @mbggenerated
	 */
	int insertSelective(Tag record);

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_tag
	 * @mbggenerated
	 */
	Tag selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_tag
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Tag record);

	/**
	 * This method was generated by MyBatis Generator. copyright @ www.9he.com b2b_tag
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Tag record);

	/**
     *  新增: 查询标签/关键字
     */
    List<Tag> selectBySearchModel(TagSearchModel searchModel, RowBounds rowBounds);
    
    int selectCountBySearchModel(TagSearchModel searchModel);
    
    /**
     * 通过分类ID获取Tag
     */
    List<Tag> selectByCategoryId(Integer categoryId);
    
    /**
     * 删除Tag
     * @param categoryId
     * @return
     */
    int deleteByPrimaryKey(Integer id);
}