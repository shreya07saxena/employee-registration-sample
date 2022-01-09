FROM openjdk:8
EXPOSE 8080
ADD target/EmployeeRegistration-0.0.1-SNAPSHOT.jar EmployeeRegistration-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/EmployeeRegistration-0.0.1-SNAPSHOT.jar"]