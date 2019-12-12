```
mvn package
docker build -t springio/spring-with-docker .
mvn com.google.cloud.tools:jib-maven-plugin:dockerBuild -Dimage=springio/spring-with-docker
check image before running: docker images --all
docker run -p 8080:8080 -t springio/spring-with-docker
```