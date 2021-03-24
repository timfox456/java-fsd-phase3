package com.example.SpringSecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class MainController {
	
    @RequestMapping(value="/", method = RequestMethod.GET)

    public String Default() {
    	return "index";
    }
    
    @RequestMapping(value="/home", method = RequestMethod.GET)
    public String Home() {
    	return "home";
    }

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String Hello() {
    	return "hello";
    }
    @RequestMapping(value="/users", method = RequestMethod.GET)
    public String Users() {
    	return "users";
    }
    
    @RequestMapping(value="/error", method = RequestMethod.GET)
    public String Error() {
    	return "error";
    }
}
