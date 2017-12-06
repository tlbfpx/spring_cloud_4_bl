FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER tlb

VOLUME /tmp
ADD product-ui-1.0.0.jar app.jar
EXPOSE 9300
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]