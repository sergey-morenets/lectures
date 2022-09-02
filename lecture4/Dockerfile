FROM openjdk:18-alpine

#This is comment

LABEL Author="Sergiy Morenets"

ADD src/main/java/Starter.java /opt/

RUN echo "We're going to build our first Docker image"

WORKDIR /opt

RUN javac Starter.java && rm Starter.java

CMD java Starter