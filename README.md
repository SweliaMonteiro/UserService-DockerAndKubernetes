# User Service Deployment using Docker and Kubernetes

## Problem Statement

You are working on a project that requires you to create a user service. Deploy the user service using Docker and Kubernetes. 

## Requirements
1. Create a user service jar file.
2. Create a docker file for the user service. Add the necessary dependencies like openjdk:17. Add entrypoint to run the jar file.
3. Run the docker file to create a docker image using the command `docker build -t sweliamonteiro/userservice:v1.0 .` 
4. `sweliamonteiro` is the docker hub username which you get after creating an account on [Docker Hub](https://hub.docker.com/) and `userservice` is the image name. `v1.0` is the version of the image.
5. Push the docker image to the docker hub using the command `docker push sweliamonteiro/userservice:v1.0`
6. Create a deployment file for the user service. The deployment file should have 5 replicas and use the docker image `sweliamonteiro/userservice:v1.0`. Apply the deployment file using the command `kubectl apply -f UserServiceDeployment.yaml`
7. Create a service file for the user service. The service file should expose the user service on port 8081 and should be of type LoadBalancer. Apply the service file using the command `kubectl apply -f UserServiceService.yaml`
8. To run kubernetes locally, you can use [minikube](https://minikube.sigs.k8s.io/docs/start/). Install minikube and start the cluster using the command `minikube start`
9. Get the URL of the user service using the command `minikube service userservice --url`. The URL should be `http://<ip>:<port>`. Hit the URL using postman to check if the user service is running.
10. You can get the URL of the dashboard using the command `minikube dashboard`. You can check the status of the user service in the dashboard and also check the logs of the user service of each pod.
