FROM maven:3-openjdk-18 as maven

COPY pom.xml /opt/pom.xml

WORKDIR /opt

RUN --mount=type=cache,target=~/.m2/repository mvn dependency:resolve

COPY . /opt/

RUN --mount=type=cache,target=~/.m2/repository mvn package spring-boot:repackage

FROM openjdk:18-alpine

LABEL Author="Sergiy Morenets"

COPY --from=maven /opt/target/docker-1.0-SNAPSHOT.jar /opt/app.jar

RUN echo "We're going to build our first multi-stage image"

WORKDIR /opt

CMD java -jar app.jar