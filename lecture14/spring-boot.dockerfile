FROM maven:3-openjdk-18 as maven

COPY . /opt/

RUN mvn package

FROM openjdk:18-alpine

LABEL Author="Sergiy Morenets"

ADD --from=maven /opt/target/docker-1.0-SNAPSHOT.jar /opt/app.jar

RUN echo "We're going to build our first multi-stage image"

WORKDIR /opt

CMD java -jar app.jar