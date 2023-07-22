package com.andresruiz.validationdemo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
        private long id;

        @NotBlank(message = "Name is mandatory")
        private String name;

        @Email(message = "Invalid email")
        private String email;
}