# Student App

This is a simple Spring Boot application designed to manage student data. The application is containerized using Docker and uses PostgreSQL as the database.

## Application Specifications

- **Framework**: Spring Boot
- **Database**: PostgreSQL
- **Language**: Java
- **Build Tool**: Maven
- **Containerization**: Docker and Docker Compose
- **Networking**: Custom Docker bridge network
- **Data Persistence**: Docker volume for PostgreSQL

## Endpoints

| HTTP Method | Endpoint       | Description                       |
|-------------|----------------|-----------------------------------|
| GET         | `/students`    | Fetches a list of all students.  |
| GET         | `/add`         | Adds a new student (default data: `name: "Shree", age: 22`). |

## Prerequisites

Before running the application, ensure the following are installed:

1. **Docker**: To containerize and run the application.
2. **Docker Compose**: To orchestrate the application and database services.

## How to Run

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-repo/student-app.git
   cd student-app


2. **Build the Application**:
   ```bash
   mvn clean package

3. **Run the Application**:
   ```bash
   docker-compose up --build
4. **Access Application**:
    The application will be accessible at `http://localhost:8080`.

5. **Stop the Application**:
   ```bash
   docker-compose down


## Docker Overview

- **Dockerfile**:  
  Packages the Spring Boot app into a container using OpenJDK.

- **Docker Compose**:  
  Orchestrates app and PostgreSQL services.

### Docker Network

- **Custom Bridge Network (`s-network`)**:  
  A dedicated bridge network ensures secure communication between the application and the PostgreSQL database. This network isolates the services for better control and security.

### Docker Volume

- **Docker Volume (`postgres-s-data`)**:  
  A persistent volume that stores PostgreSQL data. This volume ensures that the data remains intact even when the containers are stopped or removed, preventing data loss.

    