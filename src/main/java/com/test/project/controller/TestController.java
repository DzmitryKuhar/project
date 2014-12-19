package com.test.project.controller;

import com.test.project.service.iface.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class TestController {

    private static final Logger logger = Logger.getLogger(TestController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello Mops!");
        logger.info("welcome request");
        userService.show();
        return "hello";
    }

    @RequestMapping(value = "/he", method = RequestMethod.GET)
    public String abc(ModelMap model) {
        model.addAttribute("message", "I love my mops");
        logger.error("error");
        return "hello";
    }
}
