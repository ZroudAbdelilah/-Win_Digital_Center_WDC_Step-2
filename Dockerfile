FROM openjdk:11-alpine
ARG JAR_FILE=target/build.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]