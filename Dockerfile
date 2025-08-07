#Build
FROM maven:3.9.11 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

#Runtime
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080
#
## Use running.sh as entrypoint
ENTRYPOINT ["java", "-Xms512m", "-Xmx512m", "-jar", "/app/app.jar"]