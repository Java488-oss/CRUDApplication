FROM openjdk:11
ADD /target/CRUDApplication-1.jar backend.jar
ENTRYPOINT ["java", "-jar", "backend.jar"]