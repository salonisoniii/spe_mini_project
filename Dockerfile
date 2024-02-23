FROM openjdk:17
EXPOSE 8080
ADD target/spe_mini_project.jar spe_mini_project.jar
ENTRYPOINT ["java","-jar","/spe_mini_project.jar"]