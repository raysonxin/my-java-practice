package com.yonghui.platform.usercenter.service.impl;

import com.yonghui.platform.usercenter.model.UserLoginLog;
import com.yonghui.platform.usercenter.mapper.UserLoginLogDao;
import com.yonghui.platform.usercenter.service.IUserLoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录日志 服务实现类
 * </p>
 *
 * @author raysonxin
 * @since 2019-04-23
 */
@Service
public class UserLoginLogServiceImpl extends ServiceImpl<UserLoginLogDao, UserLoginLog> implements IUserLoginLogService {

}
