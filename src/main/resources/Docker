# syntax=docker/dockerfile:1

FROM eclipse-temurin:17-jdk-jammy

# Set the working directory inside the image
WORKDIR /app

# Copy Maven wrapper files and project configuration
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

# Resolve Maven dependencies
RUN ./mvnw dependency:resolve

# Copy application source code
COPY src ./src

# Command to run the Spring Boot application
CMD ["./mvnw", "spring-boot:run"]
