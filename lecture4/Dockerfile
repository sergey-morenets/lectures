FROM openjdk:18-alpine

LABEL Author="Sergiy Morenets"

RUN echo "Our first Docker image!"

ADD src/main/java/HelloWorld.java /opt/

WORKDIR /opt

RUN javac HelloWorld.java

CMD java HelloWorld