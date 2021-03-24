package com.example.TaskManager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TaskManager.entities.Task;
import com.example.TaskManager.entities.User;
import com.example.TaskManager.repositories.TaskRepository;

@Service
public class TaskService {
	
	
	@Autowired
	private TaskRepository taskRepository;
	
	public Iterable<Task> GetAllTasks() {
	
		return taskRepository.findAll();
	}

	public Iterable<Task> GetTasksByUser(User user) {
		//TODO: what do we do if the user doesn't have any tasks or doesn't exist?
		
		return(taskRepository.findAllByUser(user));
	}
}
