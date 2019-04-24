package com.yonghui.platform.usercenter.facade.stub;

import com.yonghui.platform.usercenter.facade.vo.RespUserVo;

public interface UserFacade {

    RespUserVo getUserByName(String name);
}
