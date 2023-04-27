FROM amazoncorretto:17-alpine-jdk
MAINTAINER CAROCHAVEZ
COPY target/acc-0.0.1-SNAPSHOT.jar acc-app.jar
ENTRYPOINT ["java","-jar","/acc-app.jar"]
