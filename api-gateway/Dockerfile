FROM openjdk:19-jdk-alpine

RUN apk --update --no-cache add curl

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
 
COPY src ./src

COPY wait-for-it.sh ./
RUN chmod +x ./wait-for-it.sh

ENTRYPOINT [ "./wait-for-it.sh",  "config-server:9192/actuator/health"]

CMD ["./mvnw", "spring-boot:run"]
