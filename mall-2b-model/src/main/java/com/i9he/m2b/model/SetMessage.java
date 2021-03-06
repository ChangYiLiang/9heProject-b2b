package com.i9he.m2b.model;

import java.io.Serializable;
import org.hibernate.validator.constraints.NotEmpty;

public class SetMessage implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_message_set.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_message_set.user_id
     *
     * @mbggenerated
     */
    @NotEmpty(message = "{m2b.setmessage.userId.validation.notempty}")
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_message_set.type_id
     *
     * @mbggenerated
     */
    @NotEmpty(message = "{m2b.setmessage.typeId.validation.notempty}")
    private Integer typeId;

    /**
     * This field was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_message_set
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_message_set.id
     *
     * @return the value of b2b_message_set.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_message_set.id
     *
     * @param id the value for b2b_message_set.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_message_set.user_id
     *
     * @return the value of b2b_message_set.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_message_set.user_id
     *
     * @param userId the value for b2b_message_set.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_message_set.type_id
     *
     * @return the value of b2b_message_set.type_id
     *
     * @mbggenerated
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * copyright @ www.9he.com b2b_message_set.type_id
     *
     * @param typeId the value for b2b_message_set.type_id
     *
     * @mbggenerated
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}