FROM maven:3.6.3-jdk-8-slim AS build-stage
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn clean package

FROM java:8-jre-alpine
RUN apk add --no-cache curl
COPY --from=build-stage /tmp/target/*.jar /opt/atem/app.jar
WORKDIR /opt/atem

ENTRYPOINT ["java","-jar","/app.jar"]