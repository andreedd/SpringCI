# SpringCI

Simple Spring application using docker

## Getting started

### Prerequisites
This project requires [Docker](https://www.docker.com) and [Docker Compose](https://docs.docker.com/compose/)

For development, a local JDK 8 environment is suggested.

### Installing

To build the Docker image use:

```
docker-compose build
```

To run the project use:

```
docker-compose up
```

The project should now be running at:

```
localhost:3000
```

## Frontend

The frontend is built with docker-compose using the Dockerfile located at [ReactCI](https://github.com/andreedd/ReactCI)

## Deployment

This project is built with continious deployment in mind.
Every update to master branch pushes the new docker image to docker-hub using github actions.
The project uses [Watchtower](https://github.com/containrrr/watchtower) to check for new images from docker-hub.
If new images are found the deployment is updated wherever ```docker-compose up``` is run
