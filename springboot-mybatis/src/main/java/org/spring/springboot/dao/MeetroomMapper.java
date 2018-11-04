package org.spring.springboot.dao;

import org.spring.springboot.domain.Meetroom;

public interface MeetroomMapper {
    int deleteByPrimaryKey(Integer meetId);

    int insert(Meetroom record);

    int insertSelective(Meetroom record);

    Meetroom selectByPrimaryKey(Integer meetId);

    int updateByPrimaryKeySelective(Meetroom record);

    int updateByPrimaryKeyWithBLOBs(Meetroom record);

    int updateByPrimaryKey(Meetroom record);
}