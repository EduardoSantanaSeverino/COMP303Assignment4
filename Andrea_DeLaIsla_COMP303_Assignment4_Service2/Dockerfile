FROM java:8-jdk-alpine

COPY ./target/Andrea_DeLaIsla_COMP303_Assignment4_Service2-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch Andrea_DeLaIsla_COMP303_Assignment4_Service2-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","Andrea_DeLaIsla_COMP303_Assignment4_Service2-0.0.1-SNAPSHOT.jar"]