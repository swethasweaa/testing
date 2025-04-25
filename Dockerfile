FROM openjdk:8-jdk

# Install Maven (if not already in the image)
RUN apt-get update && apt-get install -y maven

# Set the working directory inside the container
WORKDIR /app

COPY . /app

RUN mvn -v  # Check Maven version to ensure it's installed

# Run the Maven build
RUN mvn clean install -X
