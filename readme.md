## Spring Boot - Kafka

## System Requirements

- Java openjdk : Version 17.0.2
- Spring Boot : version 3.4.1
- Maven : Apache Maven 3.9.3
- Editor : Intellij IDEA 2023.1.1 Community Edition
- Docker

## Dependencies

- Spring Web
- Lombok
- kafka
- jackson-databind

## Run Project

1. clone project Spring Boot
```
git clone https://github.com/rardan97/spring-kafka.git
```
2. Run Project spring boot using docker-compose
```
docker-compose up --build
```
waiting until prossess build and deploy success




3. Access Endpoint Api

access endpoint using postman for testing spring boot - kafka

#### send log events
```
- url: http://localhost:8080/api/logs
- method : POST
- request Body : 
 {
  "level": "SUCCESS",
  "message": "Database connection Successfully",
  "timestamp": 1691404700000
}
```