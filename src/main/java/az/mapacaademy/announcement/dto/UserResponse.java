package az.mapacaademy.announcement.dto;

import az.mapacaademy.announcement.enums.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class UserResponse {
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String phoneNumber;
    private String email;
    private String username;
    @Enumerated(EnumType.STRING)
    private Role role;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

}
