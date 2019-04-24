package com.yonghui.platform.usercenter.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yonghui.platform.usercenter.model.SysUserInfo;
import com.yonghui.platform.usercenter.dao.SysUserInfoDao;
import com.yonghui.platform.usercenter.service.ISysUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author raysonxin
 * @since 2019-04-23
 */
@Service
public class SysUserInfoServiceImpl extends ServiceImpl<SysUserInfoDao, SysUserInfo> implements ISysUserInfoService {

    @Override
    public SysUserInfo getByName(String name) {

        SysUserInfo userInfo = this.getOne(new QueryWrapper<SysUserInfo>()
                .lambda()
                .eq(SysUserInfo::getName, name)
        );

        return userInfo;
    }
}
