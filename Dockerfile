FROM openjdk:17-jdk-alpine
WORKDIR /home
COPY . .
RUN ./gradlew build
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "build/libs/hello-world-spring-boot-0.0.1-SNAPSHOT.jar"]
