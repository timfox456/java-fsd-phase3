package com.example.TaskManager.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.TaskManager.entities.Task;
import com.example.TaskManager.services.TaskService;

@Controller
public class TaskController {
	
	
	@Autowired 
	private TaskService taskService;

	@GetMapping(value="/")
    public String showIndexPage() {   
		 return "index";
    }
	
	@GetMapping(value="/task")
    public String showTaskPage(@RequestParam("taskId") Integer taskId, ModelMap model ) {   

		Optional<Task> task = taskService.GetTaskById(taskId);
		
        model.addAttribute("task", task.get());
		
		  
		return "taskform";
	}
	

	@PostMapping(value="/task")
    public void handleTaskForm() {   

	}
	
}
