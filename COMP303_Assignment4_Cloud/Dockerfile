FROM java:8-jdk-alpine

COPY ./target/COMP303_Assignment4_Cloud-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch COMP303_Assignment4_Cloud-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","COMP303_Assignment4_Cloud-0.0.1-SNAPSHOT.jar"]