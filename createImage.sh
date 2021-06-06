#!/bin/sh

# build
mvn -v
mvn clean package -DskipTests
mkdir -p target/dependency
(cd target/dependency; jar -xf ../*.jar)

# create docker image
docker version
docker build -t myorg/myapp .

# run container
docker run --rm --name myapp -p 8080:8080 -it myorg/myapp
