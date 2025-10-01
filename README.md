# devops-insurance-app
sample microservices app for insurance purpose
# DevOps CI/CD Project – Insurance Microservices App 🚀

## Overview
This project demonstrates a **complete DevOps pipeline** for a sample microservices insurance application, deployed on **AWS EKS** using Jenkins, Docker, Ansible, Terraform, and Kubernetes.

## Tech Stack
- **CI/CD**: Jenkins
- **Cloud**: AWS (EKS, EC2, S3, IAM, VPC)
- **Infra as Code**: Terraform
- **Configuration Management**: Ansible
- **Containers & Orchestration**: Docker, Kubernetes
- **Monitoring**: Prometheus + Grafana

## Pipeline Flow
1. Code pushed to GitHub triggers Jenkins.
2. Jenkins builds app + runs unit tests.
3. Docker image built & pushed to DockerHub.
4. Terraform provisions AWS infra (EKS).
5. Ansible deploys app to Kubernetes.
6. Prometheus + Grafana monitor performance.

## How to Run
1. Clone repo  
2. `terraform apply`  
3. `ansible-playbook ansible/playbook.yml`  

