FROM openjdk:11

WORKDIR /app

COPY ./build/libs/eureka-server-0.0.1.jar /app

CMD ["sh", "-c", "java -Duser.timezone=GMT+08:00 -Djava.security.egd=file:/dev/./urandom -jar eureka-server-0.0.1.jar"]
