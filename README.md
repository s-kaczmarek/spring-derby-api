# Spring Derby API
## List of students

### Overview of the project
This project is example of simple rest api created in spring with
usage of in memory database - Derby.

### Dependencies
This project was created with spring initializer: https://start.spring.io/ with additional dependencies:
* Web
* JPA
* Derby

### Data Model

We have 3 entieties:
* Student
* Grade
* Index

Relations between entieties:
* Student owns one index and ech index belongs to one student - **one to one**
* Index holds many grades - **one to many**

### Test Data
Test data are persisted with two methods:
- data.sql file 
- service

### Sources of knowledge
* https://www.springboottutorial.com/spring-boot-crud-rest-service-with-jpa-hibernate
* https://www.vogella.com/tutorials/ApacheDerby/article.html
#### Relations
##### One To One
* https://www.baeldung.com/jpa-one-to-one
* https://hellokoding.com/jpa-one-to-one-foreignkey-relationship-example-with-spring-boot-maven-and-mysql/
* https://www.callicoder.com/hibernate-spring-boot-jpa-one-to-one-mapping-example/
##### One To Many
* https://vladmihalcea.com/the-best-way-to-map-a-onetomany-association-with-jpa-and-hibernate/