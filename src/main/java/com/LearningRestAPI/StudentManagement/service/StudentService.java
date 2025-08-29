package com.LearningRestAPI.StudentManagement.service;

import com.LearningRestAPI.StudentManagement.dto.AddStudentRequestDto;
import com.LearningRestAPI.StudentManagement.dto.StudentDto;

import java.util.List;
import java.util.Map;

public interface StudentService {

    List<StudentDto> getAllStudents();

    StudentDto getStudentById(long id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudentById(long id);

    StudentDto updateStudentById(long id, AddStudentRequestDto addStudentRequestDto);

    StudentDto updatePartialStudent(long id, Map<String, Object> updates);
}
