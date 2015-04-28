#   Usage:
#   # Build the Docker image
#   docker build -t zim-service .

FROM java:7
MAINTAINER Sion Williams <sion5@hotmail.co.uk>

# Spring Boot applications create working directories for Tomcat by default here.
VOLUME /tmp

COPY build/libs/invader-zim.jar /opt/zim/invader-zim.jar

EXPOSE 8080
CMD java -jar /opt/zim/invader-zim.jar