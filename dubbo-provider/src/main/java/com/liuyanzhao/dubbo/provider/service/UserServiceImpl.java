package com.liuyanzhao.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.liuyanzhao.dubbo.api.entity.User;
import com.liuyanzhao.dubbo.api.service.UserService;
import com.liuyanzhao.dubbo.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @author 言曌
 * @date 2020-01-31 17:11
 */

// dubbo注解，暴露服务
@Service
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
