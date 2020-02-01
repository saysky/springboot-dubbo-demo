package com.liuyanzhao.dubbo.api.service;

import com.liuyanzhao.dubbo.api.entity.User;

import java.util.List;

/**
 * @author 言曌
 * @date 2020-01-31 16:32
 */

public interface UserService {

    /**
     * 根据ID获得用户信息
     * @param id
     * @return
     */
    User findById(Long id);

    /**
     * 添加用户
     * @@param user
     */
    void insert(User user);

    /**
     * 获得所有用户
     * @return
     */
    List<User> findAll();

}
