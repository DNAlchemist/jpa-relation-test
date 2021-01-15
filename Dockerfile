FROM nexus.isb/openjdk:11-jre-slim

COPY ./build/libs/app.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
