package com.liuyanzhao.dubbo.api.service;

import com.liuyanzhao.dubbo.api.entity.User;

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
}
