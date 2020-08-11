#Multi-stage build

#Stage 1
FROM maven:3.6-jdk-8 as build

WORKDIR /build

COPY pom.xml .

#Caches dependenceies as long as pom.xml doesn't change
RUN mvn dependency:go-offline

COPY src /build/src/

RUN mvn package

#Stage 2
FROM openjdk:8-alpine

WORKDIR /target
COPY --from=build /build/target /target

RUN adduser -D serve && \
    chown -R serve /target

USER serve

EXPOSE 8080

ENTRYPOINT ["java"]
CMD ["-jar", "./dockerci-0.0.1-SNAPSHOT.jar"]