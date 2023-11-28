package com.Blogging.payload;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private int id;

    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 4, max = 35, message = "Name must be between 4 and 35 characters")
    private String name;

    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Email ID is mandatory")
    private String email;

    @NotEmpty(message = "Password cannot be empty")
//    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$", message = "Password must be at least 8 characters long and contain at least one letter and one number")
    private String password;

    @NotEmpty(message = "About cannot be empty")
    @Size(min = 20, max = 250, message = "About must be between 20 and 250 characters")
    
    private String about;
    
    private Set<RoleDto> roles = new HashSet<>();
}
