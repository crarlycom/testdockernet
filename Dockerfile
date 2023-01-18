FROM openjdk:17
VOLUME /tmp
EXPOSE 58471
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]