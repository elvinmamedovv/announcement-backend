package az.mapacaademy.announcement.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserUpdateRequest {
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String phoneNumber;
    private String password;
}
