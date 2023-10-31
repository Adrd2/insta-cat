FROM openjdk:17

WORKDIR /app

COPY target/instacat-0.0.1-SNAPSHOT.jar /app/insta-cat.jar

ENV JAVA_OPTS=""

CMD java $JAVA_OPTS -jar /app/insta-cat.jar
