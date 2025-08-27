package com.LearningRestAPI.StudentManagement.controller;

import com.LearningRestAPI.StudentManagement.dto.StudentDto;
import com.LearningRestAPI.StudentManagement.entity.Student;
import com.LearningRestAPI.StudentManagement.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student")
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }
}
