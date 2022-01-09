FROM openjdk:8
EXPOSE 8080
ADD target/employee-registration-sample.jar employee-registration-sample.jar
ENTRYPOINT ["java", "-jar", "/employee-registration-sample.jar"]