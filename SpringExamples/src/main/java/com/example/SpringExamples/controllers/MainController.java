package com.example.SpringExamples.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.SpringExamples.beans.CustomEventPublisher;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



@Controller
public class MainController {
	

	@Autowired
	CustomEventPublisher cvp;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
    public String showIndexPage(ModelMap model){
            return "index";
    }

	
    @RequestMapping(value = "/customevent", method = RequestMethod.GET)
    public String customEvent(ModelMap map)
    {
        cvp.publish();  
        cvp.publish();
        return "customevent";
    }


}
