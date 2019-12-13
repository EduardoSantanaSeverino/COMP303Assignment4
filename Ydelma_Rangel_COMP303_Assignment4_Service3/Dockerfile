FROM java:8-jdk-alpine

COPY ./target/Ydelma_Rangel_COMP303_Assignment4_Service3-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch Ydelma_Rangel_COMP303_Assignment4_Service3-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","Ydelma_Rangel_COMP303_Assignment4_Service3-0.0.1-SNAPSHOT.jar"]