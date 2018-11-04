package org.spring.springboot.service.impl;

import org.spring.springboot.dao.RootnameMapper;
import org.spring.springboot.dao.UserMapper;
import org.spring.springboot.domain.Rootname;
import org.spring.springboot.domain.User;
import org.spring.springboot.service.RootNameService;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RootNameServiceImpl implements RootNameService {

    @Autowired
    private RootnameMapper rootnameMapper;

    @Override
    public Rootname selectAll() {
        return rootnameMapper.selectAll();
    }

    @Override
    public Rootname selectByPrimaryKey(Integer id) {
        return rootnameMapper.selectByPrimaryKey(id);
    }

}
