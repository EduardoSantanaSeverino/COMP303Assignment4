#!/bin/bash
sudo echo "pulling the eduardoamparo/assignment4-cloud docker box..."
sudo docker pull eduardoamparo/assignment4-cloud
sudo echo "pulling the eduardoamparo/assignment4-service1 docker box..."
sudo docker pull eduardoamparo/assignment4-service1
sudo echo "pulling the eduardoamparo/assignment4-web1 docker box..."
sudo docker pull eduardoamparo/assignment4-web1
sudo echo "pulling the eduardoamparo/assignment4-service2 docker box..."
sudo docker pull eduardoamparo/assignment4-service2
sudo echo "pulling the eduardoamparo/assignment4-web2 docker box..."
sudo docker pull eduardoamparo/assignment4-web2
sudo docker-compose up -d
sudo echo "done"
