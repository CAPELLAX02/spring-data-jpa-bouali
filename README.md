# Spring Data JPA - E-learning Platform Backend

This project serves as the backend for an e-learning platform and is associated with the comprehensive [Spring Data JPA course](https://www.youtube.com/watch?v=mcl_nibV39s&ab_channel=BoualiAli) led by instructor Ali Bouali. The project demonstrates how to implement various Spring Data JPA functionalities in a real-world application.

## Project Overview

This backend application provides a robust and scalable infrastructure for managing users, courses, enrollments, and other entities within an e-learning platform. It leverages **Spring Boot** and **Spring Data JPA** to manage data persistence, while also following best practices for building maintainable and extensible Java applications.

### Key Features
- User management (registration, authentication)
- Course management (create, update, delete)
- Enrollment system
- RESTful APIs for handling platform data
- Integration with PostgreSQL using Docker containers
- Database initialization using JPA's `create-drop` strategy

## Course Reference

This project is related to Ali Bouali's in-depth [Spring Data JPA Course](https://www.youtube.com/watch?v=mcl_nibV39s&ab_channel=BoualiAli). The course provides step-by-step guidance on how to use Spring Data JPA in Java applications, making it easier for developers to implement database-driven functionality with Spring Boot.

## Database Diagram

The following database diagram illustrates the relationships between various entities in the system, such as users, courses, and enrollments.

![Database Diagram](src/main/resources/static/database_diagram.png)

## Technologies Used
- **Java**: The core language of the project.
- **Spring Boot**: Simplifies the creation of production-ready applications.
- **Spring Data JPA**: Provides a seamless integration with JPA, allowing for robust database interactions.
- **PostgreSQL**: The relational database used for this project.
- **Docker**: Containerizes the PostgreSQL database for easy management and scalability.

## Setup and Installation

### Prerequisites
Before you begin, ensure you have the following tools installed:
- Java 17 or higher
- Maven 3.6+ for building the project
- Docker for running PostgreSQL in a container

### Step-by-Step Instructions

1. **Clone the repository:**
   ```bash
   git clone https://github.com/CAPELLAX02/spring-data-jpa-bouali.git

2. **Build the project using Maven:**
   ```bash
   mvn clean install

3. **Run PostgreSQL with Docker:**
   ```bash
   docker run --name my_postgres -e POSTGRES_PASSWORD=123456 -d -p 5432:5432 postgres

4. **Configure your application.yaml**
   - In your `src/main/resources/application.yaml` file, you need to configure the data source for PostgreSQL. Below is an example configuration with sensitive information hidden:
   ```bash
   spring:
     datasource:
       url: jdbc:postgresql://localhost:5432/data_jpa_db
       username: your_username  # Replace with your PostgreSQL username
       password: your_password  # Replace with your PostgreSQL password
       driver-class-name: org.postgresql.Driver
     jpa:
       hibernate:
         ddl-auto: create-drop
       database: postgresql
       show-sql: true

5. **Run the Spring Boot application:**
   ```bash
   mvn spring-boot:run

6. **Access the application:**
   - The APIs will be accessible at `http://localhost:8080`.
   - PostgreSQL will run at `localhost:5432`.

## Troubleshooting Docker and PostgreSQL

1. **Check if the Port is in Use**
- If PostgreSQL fails to start due to a port conflict, you can check if the port is already in use. Run the following command to see which process is using port `5432`:

   ```bash
  sudo lsof -i :5432
  
- If another process is using the port, you can either stop the conflicting process or use different port of your PostgreSQL container.

2. **Stop the Process Using the Port**
- If you find that another process is using the port, you can stop it using its process ID (PID)

   ```bash
  sudo kill <process_id>

- Alternatively, if you don’t want to stop the process, you can modify the PostgreSQL container to use a different port (e.g., `5433` instead of `5432`).

3. **Run the PostgreSQL Container on a Different Port**
- To avoid port conflicts, you can specify a different port for your PostgreSQL container. For example:

   ```bash
  docker run --name my_postgres -e POSTGRES_PASSWORD=123456 -d -p 5433:5432 postgres

- This will map the container's internal port `5432` to the host machine's port `5433`.

4. **List Running and Stopped Containers**
- To check which containers are currently running, use:

   ```bash
  sudo docker ps

- To see all containers, including the ones that have stopped, run:

   ```bash
  sudo docker ps -a

5. **Remove Stopped Containers**
- If you have stopped containers that you no longer need, you can remove them with the following command:

   ```bash
  sudo docker rm <container_id>
  
- To remove all stopped container at once:

   ```bash
  sudo docker rm container prune

-  These steps should help resolve common issues when managing PostgreSQL containers using Docker.

## Contributing

Feel free to submit issues or pull requests for improvements. Contributions are always welcome!

