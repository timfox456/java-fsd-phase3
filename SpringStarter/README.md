# Spring Starter Project

## Spring Initalizr

Go to the [Spring Initilzr](https://start.spring.io).  Generate a project as follows:
 * Jar Packaging
 * Java version 8
 * Your dependencies of choice (Spring Web, Spring Data JPA, MySQL....)
 * Maven package / artifact name (in this case com.example / SpringStarter)

It will download a zip file.  You may unpack the zip file into your github.


## Load into Eclipse

Open eclipse and say Import -> Maven Project.
Navigate to the location of the unzipped Spring Initializr.

## Edit the Application Properties file.

You need to edit the `src/main/resources/application.properties`

Update the properties to suit your database / user / password in mysql

```text

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/db_example
spring.datasource.username=springuser
spring.datasource.password=ThePassword

server.port=8090

```

## Do the run with Maven

Go to Run As -> Maven Build.

For Goal, type in `spring-boot-run`

It should run itself on the port specified (8090 in this case).  You will need to randomly stop using the red button in eclipse once we are done testing.




