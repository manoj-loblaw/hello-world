FROM gcr.io/loblaw-gcr/java8
MAINTAINER Manoj Sharma

ENV DIR /www/hello-world
RUN mkdir -p ${DIR}

ARG JAR_FILE=/build/libs/hello-world-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} ${DIR}/hello-world-0.0.1-SNAPSHOT.jar

WORKDIR ${DIR}

COPY docker/start-application.sh .
RUN chmod +x start-application.sh

EXPOSE 8080
EXPOSE 8083

ENTRYPOINT ./start-application.sh