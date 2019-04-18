package com.yh.platform.usercenter.model;

import java.io.Serializable;
import java.util.Date;

public class SysPlatformUser implements Serializable {
    /**
     * 
     */
    private String id;

    /**
     * saas平台用户编号
     */
    private String userId;

    /**
     * 平台类型：微信APP、微博、永辉帐号等
     */
    private String platformType;

    /**
     * 用户所在平台的识别码
     */
    private String bindCode;

    /**
     * 绑定时间
     */
    private Date bindTime;

    /**
     * 绑定的其他信息
     */
    private String bindOtherData;

    private static final long serialVersionUID = -4314426286383331130L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType == null ? null : platformType.trim();
    }

    public String getBindCode() {
        return bindCode;
    }

    public void setBindCode(String bindCode) {
        this.bindCode = bindCode == null ? null : bindCode.trim();
    }

    public Date getBindTime() {
        return bindTime;
    }

    public void setBindTime(Date bindTime) {
        this.bindTime = bindTime;
    }

    public String getBindOtherData() {
        return bindOtherData;
    }

    public void setBindOtherData(String bindOtherData) {
        this.bindOtherData = bindOtherData == null ? null : bindOtherData.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", platformType=").append(platformType);
        sb.append(", bindCode=").append(bindCode);
        sb.append(", bindTime=").append(bindTime);
        sb.append(", bindOtherData=").append(bindOtherData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}