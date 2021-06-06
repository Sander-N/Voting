FROM openjdk:8-jdk-alpine as build

COPY . .

RUN ./gradlew build

FROM openjdk:8-jre-alpine

#Copy application jar to the image
COPY /build/libs/voting-0.0.1-SNAPSHOT.jar .

ENTRYPOINT java -jar voting-0.0.1-SNAPSHOT.jar
