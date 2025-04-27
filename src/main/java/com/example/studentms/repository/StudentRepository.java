package com.example.studentms.repository;

import com.example.studentms.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JpaRepository provides standard CRUD methods (save, findById, findAll, deleteById, etc.)
// We specify the Entity type (Student) and the type of its Primary Key (Long)
@Repository // Indicates that this is a Spring Data repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // You can add custom query methods here if needed, e.g.:
    // Optional<Student> findByEmail(String email);
}