FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER tlb

VOLUME /tmp
ADD hystrix-dashboard-1.0.0.jar app.jar
EXPOSE 8030
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]