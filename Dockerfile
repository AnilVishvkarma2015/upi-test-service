FROM openjdk:18
WORKDIR /app
COPY ./upi-meta-service-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "upi-meta-service-0.0.1-SNAPSHOT.jar"]