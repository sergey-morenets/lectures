FROM openjdk:18-alpine

LABEL Author="Sergiy Morenets"

ADD target/lecture4-0.0.1-SNAPSHOT.jar /opt/

RUN echo "We're going to build our first Spring Boot image"

WORKDIR /opt

CMD java -jar lecture4-0.0.1-SNAPSHOT.jar