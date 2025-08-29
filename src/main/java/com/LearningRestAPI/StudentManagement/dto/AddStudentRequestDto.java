package com.LearningRestAPI.StudentManagement.dto;

import lombok.Data;

@Data
public class AddStudentRequestDto {
    private String name;
    private String email;
}
