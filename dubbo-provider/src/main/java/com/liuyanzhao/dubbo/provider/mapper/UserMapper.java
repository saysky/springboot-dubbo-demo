package com.liuyanzhao.dubbo.provider.mapper;

import com.liuyanzhao.dubbo.api.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 言曌
 * @date 2020-01-31 21:38
 */
@Mapper
public interface UserMapper {

    /**
     * 根据ID获得用户
     * @param id
     * @return
     */
    User findById(Long id);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 获得所有用户
     * @return
     */
    List<User> findAll();
}
