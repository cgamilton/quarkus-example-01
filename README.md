# Example Project using Quarkus, RabbitMQ

Rabbitmq documentation:  https://www.rabbitmq.com/documentation.html

Quarkus documentation: https://quarkus.io/guides/

## Running the application with Docker

``` ./mvnw package ```

### Then, build the image with:

``` docker build -f src/main/docker/Dockerfile.jvm -t quarkus/example01-jvm . ```

### Then start the containers with docker-compose:

``` cd ./src/main/docker ```
``` docker-compose up ```

## Running the application with quarkus cli in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```
