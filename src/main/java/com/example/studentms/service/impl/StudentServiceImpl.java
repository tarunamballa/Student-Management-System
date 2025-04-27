package com.example.studentms.service.impl;

import com.example.studentms.exception.ResourceNotFoundException;
import com.example.studentms.model.Student;
import com.example.studentms.repository.StudentRepository;
import com.example.studentms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Marks this as a Spring service component
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    // Constructor-based dependency injection (preferred)
    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
    }

    @Override
    public Student createStudent(Student student) {
        // Basic validation could be added here (e.g., check if email already exists)
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, Student studentDetails) {
        Student existingStudent = getStudentById(id); // Reuses getById to handle not found case

        existingStudent.setFirstName(studentDetails.getFirstName());
        existingStudent.setLastName(studentDetails.getLastName());
        existingStudent.setEmail(studentDetails.getEmail());
        // ID remains the same

        return studentRepository.save(existingStudent);
    }

    @Override
    public void deleteStudent(Long id) {
        Student student = getStudentById(id); // Check if student exists before deleting
        studentRepository.delete(student);
    }
}