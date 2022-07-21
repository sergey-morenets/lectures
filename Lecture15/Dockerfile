ARG JAR_FILE=lecture15-0.0.1-SNAPSHOT

FROM maven:3-openjdk-18 as maven

COPY pom.xml /opt/

WORKDIR /opt

RUN mvn dependency:resolve

COPY . /opt/

RUN mvn install spring-boot:repackage

FROM openjdk:18-alpine

COPY --from=maven /opt/target/${JAR_FILE} /opt/app.jar

WORKDIR /opt

CMD java -jar app.jar