# Displaying User Feedback .
## DESCRIPTION

## Project objective:

Create a Spring Boot project that will capture user feedback using a REST endpoint. The REST resource will take in parameters using HTTP POST. The feedback data will be then added to a database table.


## Background of the problem statement:

As a part of developing an ecommerce web application, a REST resource is needed to capture user feedback. Feedback data will be received from third-party apps and websites. The data will be sent to the REST API which will collect feedback from various sources.


### You must use the following:

 *  Eclipse as the IDE
 *  Apache Tomcat as the web server
 *  Spring Boot with Hibernate


### Following requirements should be met:

 *  Create a MySQL table named feedback for storing feedback data
 *  An entity class Feedback should be made with annotations to link it with the feedback table
 *  A repository class should then map the entity class to the CrudRepository interface
 *  Create a REST controller class to create the REST endpoint. It should take in parameters using the POST protocol
 *  Data received in the REST controller will be then saved into the database
 *  Create a test form in HTML to submit data to the REST endpoint to ensure it’s working
    - This can be a purely client-side code form (html/css/js) -- recommend using the [javascript `request` library](https://github.com/request/request)
    - Or it could be a server-side JSP
 *  The step-by-step process involved in completing this task should be documented


### Using CURL or Postman

 You can test your service using curl or Postman.  Here is an example:

```console
curl -X GET http://localhost:8090/feedback
[{"id":1,"comments":"Awesome","rating":10,"user":"tim"},{"id":2,"comments":"Also Awesome","rating":10,"user":"tim"},{"id":3,"comments":"Awesome","rating":10,"user":"tim"}]%
```

You can also use CURL or postman to do a POST for adding feedback.  Here's how you can test this:

```console
curl -X POST localhost:8090/feedback -H 'Content-type:application/json' -d '{"id":1,"comments":"Awesome","rating":10,"user":"tim"}'
```

You can also use the GUI app POSTman if you prefer.



### Hints:

You can optionally use  the following sql syntax to create a table with some sample data

 * Create Table:

```sql
use db_example;
CREATE TABLE `feedback` (
  `id` int NOT NULL AUTO_INCREMENT,
  `comments` varchar(255) DEFAULT NULL,
  `rating` int NOT NULL,
  `user` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ;

```

 * Insert:

```sql

use db_example;
insert into feedback (comments, rating, user) VALUES ("Awesome", 10, "tim");
insert into feedback (comments, rating, user) VALUES ("Awesome 2", 10, "tim");
insert into feedback (comments, rating, user) VALUES ("Awesome 3", 10, "tim");
```
 
