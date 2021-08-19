FROM openjdk:8
EXPOSE 9191
ADD /target/sports-management-api-gateways.jar sports-management-api-gateways.jar
ENTRYPOINT ["java","-jar","/sports-management-api-gateways.jar"]