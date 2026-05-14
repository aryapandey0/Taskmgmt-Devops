\# TaskMgmt-DevOps 🚀



A production-style DevOps focused backend deployment project built using Spring Boot, Docker, Docker Compose, Jenkins CI/CD, MySQL, and Nginx Reverse Proxy.



This project demonstrates how a real-world backend application can be containerized, automated, and deployed using modern DevOps practices.



\---



\# 🔥 Features



\* Spring Boot REST API

\* Dockerized backend application

\* Multi-stage Docker build

\* MySQL container integration

\* Docker Compose orchestration

\* Nginx reverse proxy

\* Jenkins CI/CD pipeline

\* GitHub integration

\* Automated deployment workflow

\* Persistent MySQL volume

\* Container networking



\---



\# 🛠️ Tech Stack



| Technology     | Purpose                        |

| -------------- | ------------------------------ |

| Spring Boot    | Backend REST API               |

| MySQL          | Database                       |

| Docker         | Containerization               |

| Docker Compose | Multi-container orchestration  |

| Jenkins        | CI/CD automation               |

| Nginx          | Reverse Proxy                  |

| GitHub         | Source Code Management         |

| Linux          | DevOps \& container environment |



\---



\# 📂 Project Structure



```text

TaskMgmt-Devops/

│

├── src/

├── nginx/

│   ├── Dockerfile

│   └── default.conf

│

├── Dockerfile

├── docker-compose.yml

├── Jenkinsfile

├── pom.xml

└── README.md

```



\---



\# ⚙️ Docker Architecture Flow



```text

Developer Pushes Code to GitHub

&#x20;               │

&#x20;               ▼

&#x20;       Jenkins Pipeline Triggered

&#x20;               │

&#x20;               ▼

&#x20;        Jenkins Pulls Source Code

&#x20;               │

&#x20;               ▼

&#x20;        Docker Builds Images

&#x20;               │

&#x20;               ▼

&#x20;      Docker Compose Starts Services

&#x20;               │

&#x20;┌──────────────┼──────────────┐

&#x20;▼              ▼              ▼

Nginx      Spring Boot      MySQL

Reverse       Backend       Database

&#x20;Proxy

&#x20;               │

&#x20;               ▼

&#x20;         API Response

```



\---



\# 🧠 CI/CD Pipeline Flow



\## Jenkins Pipeline Stages



\### 1. Checkout



Jenkins pulls latest source code from GitHub.



\### 2. Build



Docker builds Spring Boot backend image.



\### 3. Run Containers



Docker Compose starts:



\* Backend container

\* MySQL container

\* Nginx container



\---



\# 🐳 Backend Dockerfile



```dockerfile

FROM maven:3.9.6-eclipse-temurin-21 AS build



WORKDIR /app



COPY pom.xml .

COPY src ./src



RUN mvn clean package -DskipTests



FROM eclipse-temurin:21-jdk



WORKDIR /app



COPY --from=build /app/target/\*.jar app.jar



EXPOSE 8081



ENTRYPOINT \["java","-jar","app.jar"]

```



\---



\# 🌐 Nginx Reverse Proxy



Nginx forwards client requests to the Spring Boot backend container.



Example:



```nginx

location / {

&#x20;   proxy\_pass http://backendapp:8081;

}

```



\---



\# 🐳 Docker Compose



Docker Compose manages:



\* Spring Boot container

\* MySQL container

\* Nginx container

\* Networking between containers

\* Persistent database volume



\---



\# 🚀 Jenkinsfile



```groovy

pipeline {



&#x20;   agent any



&#x20;   stages {



&#x20;       stage('Checkout') {

&#x20;           steps {

&#x20;               git 'https://github.com/aryapandey0/Taskmgmt-Devops.git'

&#x20;           }

&#x20;       }



&#x20;       stage('Build') {

&#x20;           steps {

&#x20;               sh 'docker build -t backendapp .'

&#x20;           }

&#x20;       }



&#x20;       stage('Run Containers') {

&#x20;           steps {

&#x20;               sh 'docker-compose down'

&#x20;               sh 'docker-compose up -d --build'

&#x20;           }

&#x20;       }

&#x20;   }

}

```




\# ▶️ How To Run Locally



\## Clone Repository



```bash

git clone https://github.com/aryapandey0/Taskmgmt-Devops.git

```



\## Start Containers



```bash

docker-compose up -d --build

```



\## Access Application



```text

http://localhost

```



\---



\# 💡 Key DevOps Concepts Demonstrated



\* Docker containerization

\* Multi-stage Docker builds

\* Reverse proxy using Nginx

\* Jenkins CI/CD automation

\* Docker networking

\* Persistent volumes

\* Infrastructure debugging

\* Automated deployments

\* GitHub integration



\---



\# 🧑‍💻 Author



Arya Pandey



Java Full Stack Developer | DevOps Enthusiast



