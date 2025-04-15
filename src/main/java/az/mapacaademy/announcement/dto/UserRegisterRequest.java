package az.mapacaademy.announcement.dto;


import az.mapacaademy.announcement.enums.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class UserRegisterRequest {

    private String name;
    private String surname;
    private LocalDate birthDate;
    private String phoneNumber;
    private String email;
    private String username;
    private String password;



}
