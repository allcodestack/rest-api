#
# Build stage
#
FROM maven:3.8.3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

#
# Package stage
#
FROM openjdk:17-jdk-slim
COPY --from=build /target/rest-api-0.0.1-SNAPSHOT.jar rest-api.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","rest-api.jar"]