# Java SpringBoot API

## Introduction
This is a Simple RESTful API that retrieves a Student's or group of Students' data. The project seeks to highlight the basic core concepts of a RESTful API and best practices for designing one.

## Technologies Used
- [**Java**](https://www.oracle.com/java/technologies/downloads/) - A programming language that lets you work more quickly (The universe loves speed!).
- [**Spring Boot**](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.7.3&packaging=jar&jvmVersion=18&groupId=com.example&artifactId=demo&name=demo&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.demo&dependencies=web,data-jpa,postgresql) - A framework for Java that helps to render web services, query databases and compile Java projects. The link to all the services and dependencies for this project is accessible by clicking on `Spring Boot`.
- [**Postgresql**](https://postgresapp.com/) – Postgres database is a relational database that works well with Spring Boot and Java Persistence API (JPA). Postgres App was used in this project, download and click on `initialize`, open your terminal and run `psql`.
- [**Maven**](https://maven.apache.org/) - Java packaging tool. Maven was used to package this project.

## Usage
### For Production:
- Clone this GitHub repository `git clone https://github.com/Alienz11/Java_SpringBoot_API.git`
- Open terminal to the `target` directory.
- To run the compiled Java Spring Boot API package, run this command on the terminal:
    - `java -jar Java_SpringBoot_API-0.0.1-SNAPSHOT.jar`
- To run the compiled Java Spring Boot API package on preferred PORT, run this command on the terminal:
    - `java -jar Java_SpringBoot_API-0.0.1-SNAPSHOT.jar --server.port=<prefered port number>`

### For Development:
- Clone this GitHub repository `git clone https://github.com/Alienz11/Java_SpringBoot_API.git`.
- Create your database (in this case `student`). i.e `CREATE DATABASE student;`.
- Grant privileges to `<system username>` and `postgres`.
    - `GRANT ALL PRIVILLEGES ON DATABASE "student" to "<system username>";`
    - `GRANT ALL PRIVILLEGES ON DATABASE "student" to "postgres";`
- I recommend you use IntelliJ IDE for development. Download the `Database Navigator` plugin, if you are using the Community Edition of IntelliJ.
- Connect your project with the database provided by the `postgreapp` with the help of the `Database Navigator` plugin. (Get access to the plugin by clicking on `DB Browser` on the left sidebar of the IDE)
- Click the `Green play/start icon` on the top of the IDE or use `Ctrl + R`.

## API Details :
### Accepted Parameters
The API will respond to the following 'Accept:' values with appropriate content.
- text/plain - Content will be returned as a plain string.
- application/json - Content will be returned as a JSON object.
- text/html - Content will be returned as an HTML page containing key:value pairs in an unordered list.

### Operations

| Method   | Path                                                             | Description                                                                                                                                    |
|:---------|:-----------------------------------------------------------------|:-----------------------------------------------------------------------------------------------------------------------------------------------|
| `GET`    | `/api/v1/students`                                               | Fetches all the students' data from the database                                                                                               |
| `GET`    | `/api/v1/students/:id`                                           | Fetches specific student data with help of the id from the database                                                                            |
| `POST`   | `/api/v1/students`                                               | Creates and stores a new student data in the database                                                                                          |
| `PUT`    | `/api/v1/students/:id?name=<name>&email=<email>`                 | Updates specific student's data(Only name and email can be updated, with either being Optional for update) with help of the id to the database |
| `DELETE` | `/api/v1/students/:id`                                           | Deletes specific student's data with help of the id from the database                                                                          |


## Testing
Test CRUD operations, Accept parameters, and construct requests with [Postman](https://www.postman.com/)

## Reference
This project was done as a requirement in getting the `Getting Started with Spring Boot` Certification with [Amigoscode](https://amigoscode.com/courses)