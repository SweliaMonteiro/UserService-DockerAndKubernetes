# Whatever required to install openjdk-17, it will automatically fetch from the base image
FROM openjdk:17

# Provides the information about the author of the image
LABEL authors="sweliamonteiro"

# Copy the jar file from the target directory to the docker image directory
COPY target/UserService-1.0.jar app.jar

# ENTRYPOINT is the command that will be executed when the container starts i.e. the jar file will be executed
ENTRYPOINT ["java", "-jar", "app.jar"]
