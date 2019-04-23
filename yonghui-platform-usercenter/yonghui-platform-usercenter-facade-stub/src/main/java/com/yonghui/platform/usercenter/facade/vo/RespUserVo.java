package com.yonghui.platform.usercenter.facade.vo;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class RespUserVo implements Serializable {

    private static final long serialVersionUID = 7824018014442576306L;

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 生日
     */
    private String birthdate;

    /**
     * 家庭电话
     */
    private String mobilePhone;

    /**
     * 头像URL
     */
    private String avatar;

    /**
     * 修改人
     */
    private String modifiyUser;

    /**
     * 修改时间
     */
    private LocalDateTime modifyTime;

}
