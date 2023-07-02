FROM alexeysidorov/debian-liberica11:1.0.1
ARG JAR_FILE=target/remote-server.jar
COPY ${JAR_FILE} remote-server.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/remote-server.jar"]
