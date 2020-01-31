package com.liuyanzhao.dubbo.comsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.liuyanzhao.dubbo.api.entity.User;
import com.liuyanzhao.dubbo.api.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 言曌
 * @date 2020-01-31 21:26
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }
}
