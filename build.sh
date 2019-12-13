#!/bin/bash
sudo echo "Welcome to building deployment for Bood Bank Application - Assignment 4 Java EE application..."
sudo echo ""
sudo echo ""

sudo echo "Building docker image eduardoamparo/assignment4-cloud..."
cd COMP303_Assignment4_Cloud/
mvn package
sudo docker build -t eduardoamparo/assignment4-cloud .
cd ..
sudo echo "Done. -- Building docker image eduardoamparo/assignment4-cloud..."
sudo echo ""
sudo echo ""

sudo echo "Building docker image eduardoamparo/assignment4-service1..."
cd Eduardo_Santana_COMP303_Assignment4_Service1/
mvn package
sudo docker build -t eduardoamparo/assignment4-service1 .
cd ..
sudo echo "Done. -- Building docker image eduardoamparo/assignment4-service1..."
sudo echo ""
sudo echo ""

sudo echo "Building docker image eduardoamparo/assignment4-web1..."
cd Eduardo_Santana_COMP303_Assignment4_Web1/
mvn package
sudo docker build -t eduardoamparo/assignment4-web1 .
cd ..
sudo echo "Done. -- Building docker image eduardoamparo/assignment4-web1..."
sudo echo ""
sudo echo ""

sudo echo "Pushing docker image eduardoamparo/assignment4-cloud..."
cd COMP303_Assignment4_Cloud/
mvn package
sudo docker push eduardoamparo/assignment4-cloud 
cd ..
sudo echo "Done. -- Pushing docker image eduardoamparo/assignment4-cloud..."
sudo echo ""
sudo echo ""

sudo echo "Pushing docker image eduardoamparo/assignment4-service1..."
cd Eduardo_Santana_COMP303_Assignment4_Service1/
mvn package
sudo docker push eduardoamparo/assignment4-service1 
cd ..
sudo echo "Done. -- Pushing docker image eduardoamparo/assignment4-service1..."
sudo echo ""
sudo echo ""

sudo echo "Pushing docker image eduardoamparo/assignment4-web1..."
cd Eduardo_Santana_COMP303_Assignment4_Web1/
mvn package
sudo docker push eduardoamparo/assignment4-web1 
cd ..
sudo echo "Done. -- Pushing docker image eduardoamparo/assignment4-web1..."
sudo echo ""
sudo echo ""

