FROM openjdk:8-jdk-alpine
ENV APP_NAME numeros
COPY ./target/numeros-1.0-SNAPSHOT.jar /app/numeros-1.0-SNAPSHOT.jar
WORKDIR /app
CMD ["java", "-jar", "numeros-1.0-SNAPSHOT.jar"]