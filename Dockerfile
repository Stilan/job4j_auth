FROM openjdk
WORKDIR auth
ADD target/job4j_auth-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT java -jar app.jar