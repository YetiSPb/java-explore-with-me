package ru.practicum.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
public class UserDto {

    private Long id;

    @NotBlank
    @NotNull
    @Email
    @Size(min = 6, max = 254)
    private String email;

    @NotBlank
    @NotNull
    @Size(min = 2, max = 250)
    private String name;
}
