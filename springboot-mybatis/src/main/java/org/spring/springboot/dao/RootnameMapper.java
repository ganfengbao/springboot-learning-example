package org.spring.springboot.dao;

import org.spring.springboot.domain.Rootname;

import java.util.Map;

public interface RootnameMapper {
    int deleteByPrimaryKey(Integer rootId);

    int insert(Rootname record);

    int insertSelective(Rootname record);

    Rootname selectByPrimaryKey(Integer rootId);

    int updateByPrimaryKeySelective(Rootname record);

    int updateByPrimaryKey(Rootname record);

    Rootname selectAll();
}