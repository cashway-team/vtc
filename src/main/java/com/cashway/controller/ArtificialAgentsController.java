package com.cashway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mmzz on 2014/7/16.
 */
@Controller
@RequestMapping("/agents")
public class ArtificialAgentsController {


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "agents/index";
    }


}
