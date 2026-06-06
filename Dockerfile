FROM amazoncorretto:17
COPY target/aws-test.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]