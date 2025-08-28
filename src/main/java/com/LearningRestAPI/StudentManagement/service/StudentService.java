package com.LearningRestAPI.StudentManagement.service;

import com.LearningRestAPI.StudentManagement.dto.StudentDto;

import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStudents();
}
