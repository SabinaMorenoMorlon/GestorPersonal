FROM openjdk:17-jdk-oracle
COPY "./target/GestorPersonal-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8082
ENTRYPOINT ["java","-jar","app.jar"]