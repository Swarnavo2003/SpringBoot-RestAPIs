package com.LearningRestAPI.StudentManagement.service.impl;

import com.LearningRestAPI.StudentManagement.dto.StudentDto;
import com.LearningRestAPI.StudentManagement.entity.Student;
import com.LearningRestAPI.StudentManagement.repository.StudentRepository;
import com.LearningRestAPI.StudentManagement.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();

        return students
                .stream()
                .map(student -> modelMapper.map(student,StudentDto.class))
                .toList();
    }

    @Override
    public StudentDto getStudentById(long id) {
        Student student =  studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found with ID:"+id));
        return modelMapper.map(student, StudentDto.class);
    }
}
