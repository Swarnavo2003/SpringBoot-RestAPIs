package com.LearningRestAPI.StudentManagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class StudentDto {
    private Long id;
    private String name;
    private String email;
}
