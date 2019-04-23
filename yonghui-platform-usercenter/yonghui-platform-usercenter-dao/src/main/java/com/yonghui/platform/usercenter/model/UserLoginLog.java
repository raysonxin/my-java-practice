package com.yonghui.platform.usercenter.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户登录日志
 * </p>
 *
 * @author raysonxin
 * @since 2019-04-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserLoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 记录编号
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    /**
     * 用户编号
     */
    @TableField("USER_ID")
    private Long userId;

    /**
     * 登录时间
     */
    @TableField("LOGIN_TIME")
    private LocalDateTime loginTime;

    /**
     * 登录类型：1-登录成功，2-注销成功，3-登录失败，4-注销失败
     */
    @TableField("LOGIN_TYPE")
    private Integer loginType;

    /**
     * 登录渠道，即哪个系统，如app1，app2
     */
    @TableField("LOGIN_CHANNEL")
    private String loginChannel;

    /**
     * 登录平台：web、iOS、Android
     */
    @TableField("LOGIN_PLATFORM")
    private String loginPlatform;

    /**
     * 登录IP
     */
    @TableField("LOGIN_IP")
    private String loginIp;

    /**
     * 认证方式：1-帐号，2-微信，3-微博，4-支付宝，5-小程序
     */
    @TableField("AUTH_TYPE")
    private String authType;


}
