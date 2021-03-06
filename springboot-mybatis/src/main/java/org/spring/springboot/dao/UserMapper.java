package org.spring.springboot.dao;

import org.spring.springboot.domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int selectByUser(User user);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}