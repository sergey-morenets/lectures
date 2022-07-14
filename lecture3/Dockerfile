FROM maven:3-openjdk-18 as maven

COPY pom.xml /opt/

WORKDIR /opt

RUN --mount=type=cache,target=/home/root/.m2/ mvn dependency:resolve

COPY . /opt/

RUN mvn install spring-boot:repackage

FROM openjdk:18-alpine

COPY --from=maven /opt/target/lecture3-0.0.1-SNAPSHOT.jar /opt/

WORKDIR /opt

CMD java -jar lecture3-0.0.1-SNAPSHOT.jar