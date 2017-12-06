FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD admin-server-1.0.0.jar app.jar
EXPOSE 9800
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
