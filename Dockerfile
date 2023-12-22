FROM openjdk:17
expose 8080
Add target/spring-boot-docker-Jankin.jar spring-boot-docker-Jankin.jar
ENTRYPOINT [ "java","-jar","/spring-boot-docker-Jankin.jar" ]