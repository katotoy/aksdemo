FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /opt
COPY target/aksdemo-0.0.1-SNAPSHOT.jar /opt/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]