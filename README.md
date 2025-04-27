# Basic Student Management System

A simple RESTful API for managing student records, built with Spring Boot, Java 17, Maven, and Spring Data JPA using an in-memory H2 database.

## Overview

This project provides basic CRUD (Create, Read, Update, Delete) operations for student entities. It serves as a foundational example of building a REST API with the Spring Boot framework.

## Features

*   **List All Students:** Retrieve a list of all student records.
*   **Get Student by ID:** Fetch details of a specific student using their unique ID.
*   **Create Student:** Add a new student record to the system.
*   **Update Student:** Modify the details of an existing student.
*   **Delete Student:** Remove a student record from the system.

## Technology Stack

*   **Java:** Version 17
*   **Framework:** Spring Boot 3.1.5 
*   **Build Tool:** Apache Maven
*   **Web:** Spring Web (for REST controllers)
*   **Data Access:** Spring Data JPA
*   **Database:** H2 Database (In-Memory)
*   **Utilities:** Lombok (to reduce boilerplate code)

## Prerequisites

Before running this project, ensure you have the following installed:

*   **JDK 17:** Java Development Kit, version 17.
*   **Apache Maven:** Build automation tool.

## Getting Started

1.  **Clone the repository:**
    ```bash
    git clone <your-repository-url>
    cd student-management-system
    ```

2.  **Build the project (Optional - `spring-boot:run` handles this):**
    ```bash
    mvn clean install
    ```

## Running the Application

You can run the application using the Spring Boot Maven plugin:

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080` by default (check `application.properties` if you changed the port).

You should see output indicating the application has started, including:

```
Application Started: http://localhost:8080
H2 Console (if enabled): http://localhost:8080/h2-console
```

## API Endpoints

The base path for all API endpoints is `/api/v1/students`.

| Method | Endpoint          | Description                   | Request Body (Example)                                             | Response                           |
| :----- | :---------------- | :---------------------------- | :----------------------------------------------------------------- | :--------------------------------- |
| `GET`  | `/`               | Get all students              | -                                                                  | `200 OK` - List of students      |
| `GET`  | `/{id}`           | Get a single student by ID    | -                                                                  | `200 OK` - Student object<br>`404 Not Found` |
| `POST` | `/`               | Create a new student          | `{"firstName": "Jane", "lastName": "Doe", "email": "jane@mail.com"}` | `201 Created` - Created student    |
| `PUT`  | `/{id}`           | Update an existing student    | `{"firstName": "Janet", "lastName": "Doe", "email": "janet@mail.com"}` | `200 OK` - Updated student<br>`404 Not Found` |
| `DELETE`| `/{id}`           | Delete a student by ID        | -                                                                  | `204 No Content`<br>`404 Not Found` |

**Example using `curl`:**

*   **Create:**
    ```bash
    curl -X POST -H "Content-Type: application/json" -d '{"firstName": "Test", "lastName": "User", "email": "test.user@example.com"}' http://localhost:8080/api/v1/students
    ```
*   **Get All:**
    ```bash
    curl http://localhost:8080/api/v1/students
    ```
*   **Get By ID (assuming ID 1 exists):**
    ```bash
    curl http://localhost:8080/api/v1/students/1
    ```

## Database Access (H2 Console)

This project uses an in-memory H2 database. You can access its web console (if enabled in `application.properties`) to view the tables and data directly.

1.  Navigate to: `http://localhost:8080/h2-console`
2.  Use the following connection details (from `application.properties`):
    *   **Driver Class:** `org.h2.Driver`
    *   **JDBC URL:** `jdbc:h2:mem:studentdb`
    *   **User Name:** `sa`
    *   **Password:** (leave empty)
3.  Click **Connect**. You should see the `STUDENTS` table.

## Author & Contact

Created by **Tarun Amballa**.

*   **GitHub:** [github.com/tarunamballa](https://github.com/tarunamballa)
*   **LinkedIn:** [linkedin.com/in/amballatarun](https://www.linkedin.com/in/amballatarun/)

## License

This project is open source. Feel free to use it as a learning resource. You can add a specific license like MIT if desired.
