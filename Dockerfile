FROM java:7
VOLUME /tmp
ADD build/invader-zim.jar /opt/msvc/invader-zim.jar
CMD java -jar /opt/msvc/gs-spring-boot.jar