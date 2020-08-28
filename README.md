# Spring Cloud eureka Demo


## Launch demo in one network

### Build docker image

```sh
$> docker-compose build
```

### Launch containers

```sh
$> docker-compose up -d
```

## Launch demo in different network

### Launch eureka server

```sh
$> cd eureka-server
$> docker-compose up -d --build
```

### Launch eureka client one

```sh
$> cd eureka-client-one
$> docker-compose up -d --build
```

### Launch eureka client two

```sh
$> cd eureka-client-two
$> docker-compose up -d --build
```
