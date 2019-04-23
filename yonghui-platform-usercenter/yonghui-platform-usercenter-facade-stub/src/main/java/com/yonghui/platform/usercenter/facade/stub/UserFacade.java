package com.yonghui.platform.usercenter.facade.stub;

import com.yonghui.platform.usercenter.facade.vo.RespUserVo;
import org.springframework.web.bind.annotation.RequestMapping;


public interface UserFacade {

    @RequestMapping(value = "/getByName")
    RespUserVo getUserByName(String name);
}
