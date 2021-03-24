package com.example.TaskManager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TaskController {
	
	

	@GetMapping(value="/")
    public String showIndexPage() {   
		 return "index";
    }
	
	@GetMapping(value="/task")
    public String showTaskPage() {   

		return "taskform";
	}
	

}
