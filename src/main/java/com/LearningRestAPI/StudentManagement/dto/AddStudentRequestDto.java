package com.LearningRestAPI.StudentManagement.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AddStudentRequestDto {
    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 30, message = "Name should be of atleast 3 to 20 characters")
    private String name;

    @Email
    @NotBlank(message = "Email is required")
    private String email;
}
