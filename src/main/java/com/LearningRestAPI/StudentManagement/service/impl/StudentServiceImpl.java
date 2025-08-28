package com.LearningRestAPI.StudentManagement.service.impl;

import com.LearningRestAPI.StudentManagement.dto.StudentDto;
import com.LearningRestAPI.StudentManagement.entity.Student;
import com.LearningRestAPI.StudentManagement.repository.StudentRepository;
import com.LearningRestAPI.StudentManagement.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();

        return students
                .stream()
                .map(student -> new StudentDto(student.getId(),student.getName(),student.getEmail())).toList();
    }
}
