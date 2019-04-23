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
 * 用户关联第三方用户编号
 * </p>
 *
 * @author raysonxin
 * @since 2019-04-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysPlatformUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private String id;

    /**
     * saas平台用户编号
     */
    @TableField("USER_ID")
    private String userId;

    /**
     * 平台类型：微信APP、微博、永辉帐号等
     */
    @TableField("PLATFORM_TYPE")
    private String platformType;

    /**
     * 用户所在平台的识别码
     */
    @TableField("BIND_CODE")
    private String bindCode;

    /**
     * 绑定时间
     */
    @TableField("BIND_TIME")
    private LocalDateTime bindTime;

    /**
     * 绑定的其他信息
     */
    @TableField("BIND_OTHER_DATA")
    private String bindOtherData;


}
