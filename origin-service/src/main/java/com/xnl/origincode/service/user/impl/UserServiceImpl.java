package com.xnl.origincode.service.user.impl;

import com.xnl.origincode.api.exception.ServiceException;
import com.xnl.origincode.service.user.User;
import com.xnl.origincode.service.user.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @description: 用户接口实现类
 * @author: xiaonailiang
 * @create: 2023/04/17 10:32
 */
@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public Integer addUser(User user) {
        if(user.getName() == null){
            throw new ServiceException("缺少用户名称");
        }
        //
        return 1;
    }
}
