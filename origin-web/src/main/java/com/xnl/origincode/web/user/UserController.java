package com.xnl.origincode.web.user;

import com.xnl.origincode.service.user.User;
import com.xnl.origincode.service.user.UserService;
import com.xnl.origincode.web.response.ResponseMessage;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 用户管理web服务接口
 * @author: xiaonailiang
 * @create: 2023/04/17 10:31
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @DubboReference(version = "1.0.0", group = "origin-service", protocol = "dubbo")
    UserService userService;

    /**
     *
     * @Return: java.lang.String
     * @author: xiaonailiang
     * @date:  2023/4/17 2:21 下午
     */
    @PostMapping("/add")
    public ResponseMessage addUser(@RequestBody User user){
        userService.addUser(user);
        return new ResponseMessage("200", "成功", 1);
    }

}
