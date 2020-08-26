# spring-h2-test
Spring Boot JPA, Data REST using an H2 database embedded

### Dependencies
Project "pom.xml" dependencies to include: 
````xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jdbc</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-rest</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>
````
Dependency for H2 database: 
````xml
  <dependency>
      <groupId>com.h2database</groupId>
      <artifactId>h2</artifactId>
      <version>1.4.200</version>
      <scope>runtime</scope>
  </dependency>
````

### Properties of "application.properties" file: 

````properties
#Spring Security Properties
# URL: https://www.baeldung.com/spring-boot-security-autoconfiguration
spring.security.user.name=user

#Spring database H2 properties
spring.datasource.url=jdbc:h2:mem:db
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
##See the H2 console - URL:
spring.h2.console.enabled=false

#Properties create/drop database using hibernate
spring.jpa.hibernate.ddl-auto=create-drop
spring-jpa.show-sql=true;

#Spring API properties
spring.data.rest.base-path=/api/v1
server.port=8080
#Actuators - Interessant: https://www.baeldung.com/spring-boot-actuators
````

## Build Project & Run
To run the Spring Boot app from a command line in a Terminal Windows as a single Java jar file
we first need to update the pom.xml file of our project and add a maven plugin.

Add the following XML snippet below to project "pom.xml" file: 
````pom
<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>
````
### Build Spring Boot Project with Maven
To be able to run our Spring Boot app we will need first to build it. To build and package a Spring Boot app
into a single executable JAR file with Maven, use the below command. 

> mvn install

Or you can also use an IDE like IntellJ to build: 

