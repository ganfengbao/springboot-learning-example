package org.spring.springboot.service;

import org.spring.springboot.domain.Rootname;

public interface RootNameService {

    Rootname selectAll();

    Rootname selectByPrimaryKey(Integer id);

}
