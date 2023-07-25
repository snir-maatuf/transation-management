FROM openjdk:17
EXPOSE 5433
ADD target/transaction-docker.jar transaction-docker.jar
ENTRYPOINT [ "java", "-jar", "/transaction-docker.jar" ]