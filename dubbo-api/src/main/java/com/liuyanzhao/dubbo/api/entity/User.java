package com.liuyanzhao.dubbo.api.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 言曌
 * @date 2020-01-31 16:32
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 6147345506206285446L;

    private Long id;

    private String username;

    private String nickname;

    private String email;

    private String password;
}

