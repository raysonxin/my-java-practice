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
 * 用户信息表
 * </p>
 *
 * @author raysonxin
 * @since 2019-04-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    /**
     * 姓名
     */
    @TableField("NAME")
    private String name;

    /**
     * 性别
     */
    @TableField("SEX")
    private String sex;

    /**
     * 生日
     */
    @TableField("BIRTHDATE")
    private String birthdate;

    /**
     * 家庭电话
     */
    @TableField("MOBILE_PHONE")
    private String mobilePhone;

    /**
     * 头像URL
     */
    @TableField("AVATAR")
    private String avatar;

    /**
     * 修改人
     */
    @TableField("MODIFIY_USER")
    private String modifiyUser;

    /**
     * 修改时间
     */
    @TableField("MODIFY_TIME")
    private Date modifyTime;


}
