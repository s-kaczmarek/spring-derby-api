# Spring Derby API
## List of Students with REST API in Spring with in memory database Derby 

### Overview of the project
This project is example of simple rest api created in spring with
usage of in memory database - Derby.

Project is divided into two additional branches (apart master) in order to show two different levels of complexity. 
For further informations about data structure please look at [Data Model](#data-model) 

* ***minimal-version*** - this branch contains only one entity without any complicated relations.
* ***relations-version*** - this branch contains multiple entities connected with relations.     

### Dependencies
This project was created with spring initializer: https://start.spring.io/ with additional dependencies:
* Web
* JPA
* Derby

### Data Model <a href="data-model">

#### minimal-version branch
We have only one entity:
* Student

#### relations-version
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

### API documentation
Default localhost port is changed to ***7070*** in ***application.properties*** file.
Address for webapp is: 
```
http://localhost:7070/
```
We have two different APIs for two branches.

#### minimal-version

1. List all students

Send request with ***GET*** method to address: 
```
http://localhost:7070/students
```

2. Get student by id

Send request with ***GET*** method to address:
```
http://localhost:7070/students/{id}
```
Where {id} is just number of id like: 
```
http://localhost:7070/students/1
```

3. Add new student

Send request with ***POST*** method to address:
```
http://localhost:7070/students
```
With ***JSON*** body like:
```JSON
{
	"name":"John",
	"studentNumber":"ABC1238888884"
}
```

### Sources of knowledge
***
* https://www.springboottutorial.com/spring-boot-crud-rest-service-with-jpa-hibernate
* https://www.vogella.com/tutorials/ApacheDerby/article.html
##### One To One
* https://www.baeldung.com/jpa-one-to-one
* https://hellokoding.com/jpa-one-to-one-foreignkey-relationship-example-with-spring-boot-maven-and-mysql/
* https://www.callicoder.com/hibernate-spring-boot-jpa-one-to-one-mapping-example/
##### One To Many
* https://vladmihalcea.com/the-best-way-to-map-a-onetomany-association-with-jpa-and-hibernate/