FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar company-service.jar
ENV USERNAME=postgres
ENV PASSWORD=admin
ENV DB_URL=localhost:5432
ENTRYPOINT ["java","-jar","/company-service.jar"]