FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD config-server-1.0.0.jar app.jar
EXPOSE 8500
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
