package com.ww.growup.mmall.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author 魏巍
 * @since 2019-10-10
 */
@Data
@Accessors(chain = true)
@TableName("mmall_shipping")
public class MmallShipping {

    private Integer id;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 收货姓名
     */
    @TableField("receiver_name")
    private String receiverName;

    /**
     * 收货固定电话
     */
    @TableField("receiver_phone")
    private String receiverPhone;

    /**
     * 收货移动电话
     */
    @TableField("receiver_mobile")
    private String receiverMobile;

    /**
     * 省份
     */
    @TableField("receiver_province")
    private String receiverProvince;

    /**
     * 城市
     */
    @TableField("receiver_city")
    private String receiverCity;

    /**
     * 区/县
     */
    @TableField("receiver_district")
    private String receiverDistrict;

    /**
     * 详细地址
     */
    @TableField("receiver_address")
    private String receiverAddress;

    /**
     * 邮编
     */
    @TableField("receiver_zip")
    private String receiverZip;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;

}
