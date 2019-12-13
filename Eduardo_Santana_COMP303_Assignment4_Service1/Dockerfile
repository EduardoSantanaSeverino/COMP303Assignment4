FROM java:8-jdk-alpine

COPY ./target/Eduardo_Santana_COMP303_Assignment4_Service1-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch Eduardo_Santana_COMP303_Assignment4_Service1-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","Eduardo_Santana_COMP303_Assignment4_Service1-0.0.1-SNAPSHOT.jar"]