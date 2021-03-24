# Phase 3 End Project - Create a Task Manager

## Application

## Project Objective:
Create a task manager application with spring boot and spring Data JPA.


### Background of Problem Statement:

The Task Manager is for organizing a users to-do lists.

The user should be able to create, display, delete, and update her or his tasks (basically to-do items.)

The application will have UI in JSP.

Suggested JSP Pages:
 1. create task
 2. display tasks
 3. delete tasks
 4. update task.
 5. Login
 6. User Registration
 7. Index/Welcome 

### Important Notes:
 *  Project must be well organized in packages.
 * Usage of Repository, Service, Entity, and custom exception handling
 * All data must persist in the database. (User information should also be stored in database)
 * User must be logged in before adding or seeing the tasks. (spring boot security is acceptable but not mandatory.)
 * User must get registered, to perform the login.
 * Either monolithic or microservice based architecture is acceptable.

### Important fields of this application:
 * Task name (text box)
 * Start date (date picker)
 * End date (date picker)
 * Description (text area)
 * Email (text box)
 * Severity (drop down) (High, medium, low)
 * User (tasks should belong to a user)

### SQL

```sql
use db_example;
CREATE TABLE `task` (
  `id` int NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `end_date` datetime(6) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `severity` varchar(255) DEFAULT NULL,
  `start_date` datetime(6) DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2hsytmxysatfvt0p1992cw449` (`user_id`),
  CONSTRAINT `FK2hsytmxysatfvt0p1992cw449` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

use db_example;
insert into task (description, email, start_date, end_date, name, severity, user_id) VALUES 
("Task Description", "tim@gmail.com", '2021-03-21', '2021-03-22', "Task 1", "High", 1);

```


### Deadline 

2021-03-30
