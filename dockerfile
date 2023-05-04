#base image
FROM openjdk:8
COPY . /src/java
WORKDIR /src/java
RUN ["javac", "HTTP.java"]
ENTRYPOINT ["java","HTTP"]