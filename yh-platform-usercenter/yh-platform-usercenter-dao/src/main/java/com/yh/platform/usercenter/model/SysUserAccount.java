package com.yh.platform.usercenter.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户账户表
 * </p>
 *
 * @author raysonxin
 * @since 2019-04-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUserAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    /**
     * 帐号名称
     */
    @TableField("ACCOUNT_NO")
    private String accountNo;

    /**
     * 手机号
     */
    @TableField("MOBILE_PHONE")
    private String mobilePhone;

    /**
     * 邮件地址
     */
    @TableField("EMAIL")
    private String email;

    /**
     * 密码
     */
    @TableField("PASSWORD")
    private String password;

    /**
     * 账户状态：0-正常，1-禁用，2-锁定，3-删除
     */
    @TableField("STATUS")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField("MODIFY_TIME")
    private Date modifyTime;

    /**
     * 删除时间
     */
    @TableField("DELETE_TIME")
    private Date deleteTime;


}
