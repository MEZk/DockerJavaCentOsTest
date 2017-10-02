FROM tcnksm/centos-java:8

WORKDIR /app

COPY ./target/docker-java-*.jar /app/app.jar

CMD ["java", "-jar", "-Duser.timezone=GMT+3", "app.jar"]