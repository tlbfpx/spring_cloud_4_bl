FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER tlb

VOLUME /tmp
ADD discovery-server-1.0.0.jar app.jar
EXPOSE 8761
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]