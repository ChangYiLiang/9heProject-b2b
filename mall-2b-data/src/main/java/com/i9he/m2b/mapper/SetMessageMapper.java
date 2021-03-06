package com.i9he.m2b.mapper;

import java.util.List;

import com.i9he.m2b.model.SetMessage;

public interface SetMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_message_set
     *
     * @mbggenerated
     */
    int insert(SetMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_message_set
     *
     * @mbggenerated
     */
    int insertSelective(SetMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_message_set
     *
     * @mbggenerated
     */
    SetMessage selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_message_set
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SetMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_message_set
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SetMessage record);
    
    /**
     * 删除用户接收的消息类型
     * @param userId
     * @return
     */
    int deleteTypeIdsByUserId(Integer userId);   
    /**
     * 返回用户消息类型集合
     * @param userId
     * @return
     */
    List<SetMessage> getTypeIdByUserId(Integer userId);
    
}