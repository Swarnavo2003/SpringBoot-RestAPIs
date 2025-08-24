package com.LearningRestAPI.StudentManagement.controller;

import com.LearningRestAPI.StudentManagement.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent() {
        return new StudentDto(4L,"Swarnavo","swarnavo@email.com");
    }
}
