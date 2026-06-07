FROM amazoncorretto:17
COPY target/aws-test.war app.war
ENTRYPOINT ["java","-war","/app.war"]