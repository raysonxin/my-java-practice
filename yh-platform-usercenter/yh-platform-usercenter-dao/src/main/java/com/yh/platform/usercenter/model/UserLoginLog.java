package com.yh.platform.usercenter.model;

import java.io.Serializable;
import java.util.Date;

public class UserLoginLog implements Serializable {
    /**
     * 记录编号
     */
    private Long id;

    /**
     * 用户编号
     */
    private Long userId;

    /**
     * 登录时间
     */
    private Date loginTime;

    /**
     * 登录类型：1-登录成功，2-注销成功，3-登录失败，4-注销失败
     */
    private Byte loginType;

    /**
     * 登录渠道，即哪个系统，如app1，app2
     */
    private String loginChannel;

    /**
     * 登录平台：web、iOS、Android
     */
    private String loginPlatform;

    /**
     * 登录IP
     */
    private String loginIp;

    /**
     * 认证方式：1-帐号，2-微信，3-微博，4-支付宝，5-小程序
     */
    private String authType;

    private static final long serialVersionUID = -3537939754544252111L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Byte getLoginType() {
        return loginType;
    }

    public void setLoginType(Byte loginType) {
        this.loginType = loginType;
    }

    public String getLoginChannel() {
        return loginChannel;
    }

    public void setLoginChannel(String loginChannel) {
        this.loginChannel = loginChannel == null ? null : loginChannel.trim();
    }

    public String getLoginPlatform() {
        return loginPlatform;
    }

    public void setLoginPlatform(String loginPlatform) {
        this.loginPlatform = loginPlatform == null ? null : loginPlatform.trim();
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType == null ? null : authType.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", loginType=").append(loginType);
        sb.append(", loginChannel=").append(loginChannel);
        sb.append(", loginPlatform=").append(loginPlatform);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", authType=").append(authType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}