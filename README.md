# stack-demo
Stack Application with Docker Image



* Simple Stack data structure is implemented in Java without using Collections.
* A RESTful interface is implemented to push/pop/get integers using above Stack data structure using Spring Boot.
* Unit tests are added.
* A docker image is built using Github Actions

###### Set up in local using docker

Clone the Repo using SSH

`git clone git@github.com:NituAgarwal/stack-demo.git`

or Clone the repo using HTTPS

`git clone https://github.com/NituAgarwal/stack-demo.git`

Build the Docker
`docker build -t stack-demo .`

Run the Docker
`docker run -p 8080:8080 stack-demo`


###### RestFul commands

Create a Stack with its capacity as configurable parameter

`curl -X POST \http://localhost:8080/api/stack/create \
  -H 'Content-Type: application/json' \
  -d '{
	"capacity": 5
}'`

PUSH the Value to Stack

`curl -X PUT 'http://localhost:8080/api/stack/push?value=11'`


POP the value from Stack
`curl -X DELETE http://localhost:8080/api/stack/pop`

GET the top value from Stack
`curl -X GET http://localhost:8080/api/stack/peek`


###### Set up CI/CD pipeline using Docker Hub

CI/CD pipeline with Github Actions

Docker image is pushed to the dockerhub when any changes are committed.

Docker Repo
 `https://hub.docker.com/repository/docker/niagarwal8/stack-demo`




