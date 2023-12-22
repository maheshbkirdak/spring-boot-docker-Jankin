FROM openjdk:17
expose 8080
Add target/spring-boot-docker-Jankin spring-boot-docker-Jankin
ENTRYPOINT [ "java","-jar","/spring-boot-docker-Jankin.jar" ]