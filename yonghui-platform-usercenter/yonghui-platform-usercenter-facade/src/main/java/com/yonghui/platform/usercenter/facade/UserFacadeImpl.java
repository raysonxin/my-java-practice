package com.yonghui.platform.usercenter.facade;

import com.yonghui.platform.usercenter.facade.stub.UserFacade;
import com.yonghui.platform.usercenter.facade.vo.RespUserVo;
import com.yonghui.platform.usercenter.model.SysUserInfo;
import com.yonghui.platform.usercenter.service.ISysUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserFacadeImpl implements UserFacade {

    @Autowired
    private ISysUserInfoService sysUserInfoService;

    @Override
    public RespUserVo getUserByName(String name) {
        SysUserInfo userInfo = sysUserInfoService.getByName(name);
        RespUserVo vo = new RespUserVo();
        vo.setId(userInfo.getId());
        vo.setName(userInfo.getName());
        vo.setBirthdate(userInfo.getBirthdate());
        return vo;
    }
}
