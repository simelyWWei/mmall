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
@TableName("mmall_pay_info")
public class MmallPayInfo {

    private Integer id;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 订单号
     */
    @TableField("order_no")
    private Long orderNo;

    /**
     * 支付平台:1-支付宝,2-微信
     */
    @TableField("pay_platform")
    private Integer payPlatform;

    /**
     * 支付宝支付流水号
     */
    @TableField("platform_number")
    private String platformNumber;

    /**
     * 支付宝支付状态
     */
    @TableField("platform_status")
    private String platformStatus;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

}
