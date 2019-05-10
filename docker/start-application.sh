#!/usr/bin/env bash

if [ -z ${APPLICATION_LOG_DIRECTORY} ]; then
  export APPLICATION_LOG_DIRECTORY=$(pwd);
fi

java -jar hello-world-0.0.1-SNAPSHOT.jar
