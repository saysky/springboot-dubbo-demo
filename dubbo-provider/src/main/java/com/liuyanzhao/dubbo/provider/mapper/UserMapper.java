package com.liuyanzhao.dubbo.provider.mapper;

import com.liuyanzhao.dubbo.api.entity.User;
import org.apache.ibatis.annotations.Mapper;

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
}
