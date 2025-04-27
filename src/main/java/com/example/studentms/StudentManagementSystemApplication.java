package com.example.studentms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
        System.out.println("\nApplication Started: http://localhost:8080");
        System.out.println("H2 Console (if enabled): http://localhost:8080/h2-console\n");
    }

}