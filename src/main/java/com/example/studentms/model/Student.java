package com.example.studentms.model;

import jakarta.persistence.*; 
import lombok.Data; 
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity 
@Table(name = "students") 
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class Student {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increments the ID
    private Long id;

    @Column(name = "first_name", nullable = false) // Maps to 'first_name' column, cannot be null
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true) // Email must be unique
    private String email;

}