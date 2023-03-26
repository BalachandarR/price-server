FROM openjdk:8-jdk-alpine
MAINTAINER Bala Rangasamy And Prnauv Bala
COPY target/price-server-0.0.1-SNAPSHOT.jar price-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/price-server-0.0.1-SNAPSHOT.jar"]