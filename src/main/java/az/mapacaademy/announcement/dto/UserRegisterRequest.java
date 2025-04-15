package az.mapacaademy.announcement.dto;


import az.mapacaademy.announcement.enums.Role;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class UserRegisterRequest {
    @NotBlank(message = "Name can not be blank")
    private String name;
    @NotBlank(message = "Surname can not be blank")
    private String surname;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthDate;
    @NotNull(message = "Phone number can not be null")
    @Size(min = 10, max = 10, message = "Phone number must contain 10 characters")
    @Pattern(regexp = "\\d{10}",message = "Phone number must contain only digits")
    private String phoneNumber;
    @Email(message = "Email must be valid")
    private String email;
    @NotBlank(message = "Username can not be blank")
    private String username;
    @NotBlank(message = "Password can not be blank")
    private String password;



}
