package com.LearningRestAPI.StudentManagement.controller;

import com.LearningRestAPI.StudentManagement.dto.StudentDto;
import com.LearningRestAPI.StudentManagement.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/student")
    public List<StudentDto> getStudent() {
        return studentService.getAllStudents();
    }
}
