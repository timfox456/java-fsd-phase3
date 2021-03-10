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


## Add some extra dependencies to `pom.xml` file

```xml
	<dependency> 
		<groupId>javax.servlet</groupId> 
		<artifactId>jstl</artifactId>
 		<version>1.2</version> 
	</dependency>
			

        <dependency>
             <groupId>org.apache.tomcat.embed</groupId>
             <artifactId>tomcat-embed-jasper</artifactId>
             <scope>provided</scope>
        </dependency>
		
````	 

You may need to use eclipse to "Reload Maven" after changing the pom.xml

## Edit the Application Properties file.

You need to edit the `src/main/resources/application.properties`

Update the properties to suit your database / user / password in mysql

```text

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/db_example
spring.datasource.username=springuser
spring.datasource.password=ThePassword


logging.level.org.springframework.web: DEBUG
spring.mvc.view.prefix=/WEB-INF/jsp/
spring.mvc.view.suffix=.jsp
server.port=8090

```

## Add index.jsp file to the project.

Create the following file/folder

`SpringSetup/src/main/webapp/WEB-INF/jsp/index.jsp`

Add in a small jsp file in that folder

```html
<html>
<body>
<h2>Spring Application</h2>

</body>
</html>

```

## Do the run with Maven

Go to Run As -> Maven Build.

For Goal, type in `spring-boot:run`

It should run itself on the port specified (8090 in this case).  You will need to randomly stop using the red button in eclipse once we are done testing.




