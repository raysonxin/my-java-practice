package com.yonghui.platform.usercenter.controller;

import com.yonghui.platform.usercenter.facade.stub.UserFacade;
import com.yonghui.platform.usercenter.facade.vo.RespUserVo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference
    private UserFacade userFacade;

    @RequestMapping(value = "/user/getByName")
    public String getByName(String name) {
        RespUserVo vo = userFacade.getUserByName(name);
        return vo == null ? "not found" : vo.getId().toString();
    }
}
