package org.spring.springboot.controller;

import org.spring.springboot.domain.Rootname;
import org.spring.springboot.service.RootNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RootNameController {

    @Autowired
    private RootNameService rootNameService;

    @RequestMapping(value = "getRootName", method = RequestMethod.GET)
    public String getRootName(ModelAndView modelAndView) {

        Rootname rootname = rootNameService.selectAll();
        modelAndView.addObject(rootname);

        return "page/meet_plan";
    }
}
