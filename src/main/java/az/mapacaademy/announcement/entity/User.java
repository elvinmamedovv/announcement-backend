package az.mapacaademy.announcement.entity;

import az.mapacaademy.announcement.enums.Role;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="USER_ID")
    private Long userId;
    private String name;
    private LocalDate birthDate;
    private String email;
    private String userName;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
    private boolean locked;
    private boolean enabled;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;




}
