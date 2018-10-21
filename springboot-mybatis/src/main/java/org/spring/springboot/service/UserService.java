package org.spring.springboot.service;

import org.spring.springboot.domain.User;

import java.util.List;

public interface UserService {

    /**
     * 获取所有用户信息
     */
    User selectByPrimaryKey(Integer id);
}
