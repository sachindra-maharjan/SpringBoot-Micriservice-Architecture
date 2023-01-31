FROM openjdk:19-jdk-alpine

WORKDIR /app
COPY ./wait-for-it.sh ./
RUN chmod +x wait-for-it.sh

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
 
COPY src ./src

CMD ["./wait-for-it.sh", "config-server:9192", "--", "./mvnw", "spring-boot:run"]

#CMD ["./mvnw", "spring-boot:run"]