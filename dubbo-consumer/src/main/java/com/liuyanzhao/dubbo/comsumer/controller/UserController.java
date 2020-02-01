package com.liuyanzhao.dubbo.comsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.liuyanzhao.dubbo.api.entity.User;
import com.liuyanzhao.dubbo.api.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 言曌
 * @date 2020-01-31 21:26
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    /**
     * 获得用户列表
     * @return
     */
    @GetMapping("/user")
    public List<User> findAll() {
        return userService.findAll();
    }

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    /**
     * 添加用户
     * @param user
     */
    @PostMapping("/user")
    public void insert(@RequestBody User user) {
         userService.insert(user);
    }
}
