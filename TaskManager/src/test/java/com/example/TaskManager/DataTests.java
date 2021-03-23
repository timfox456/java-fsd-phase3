package com.example.TaskManager;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.TaskManager.entities.*;
import com.example.TaskManager.repositories.TaskRepository;

@SpringBootTest
public class DataTests {

	@Autowired
	TaskRepository taskRepository;
	
	@Test
	public void CreateTaskTest()
	{
		Task task = new Task("Task 1", null, 
					null,"High", "Description", "test@email.com", null);
			
		
		taskRepository.save(task);
		

	}
}
