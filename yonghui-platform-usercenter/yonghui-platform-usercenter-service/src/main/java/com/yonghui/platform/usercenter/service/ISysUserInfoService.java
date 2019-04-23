package com.yonghui.platform.usercenter.service;

import com.yonghui.platform.usercenter.model.SysUserInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author raysonxin
 * @since 2019-04-23
 */
public interface ISysUserInfoService extends IService<SysUserInfo> {

    SysUserInfo getByName(String name);
}
