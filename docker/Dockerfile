FROM gcr.io/loblaw-gcr/java8
MAINTAINER Manoj Sharma

ENV DIR /www/hello-world

COPY build/libs/hello-world-0.0.1-SNAPSHOT.jar ${DIR}/hello-world-0.0.1-SNAPSHOT.jar

ENTRYPOINT ./start-application.sh