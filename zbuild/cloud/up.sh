#!/bin/bash
sudo echo "pulling the eduardoamparo/assignment4-cloud docker box..."
sudo docker pull eduardoamparo/assignment4-cloud
sudo docker-compose up -d
sudo echo "done"
