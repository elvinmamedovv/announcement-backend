package az.mapacaademy.announcement.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class CreateAnnouncementRequest {

    @NotBlank(message = "Name can not be blank")
    private String announcementName;
    private String announcementDescription;
    @NotNull(message = "Price can not be null")
    @Min(value = 0, message = "Price must be greater than or equal to zero")
    private Double price;
    @NotNull(message = "Phone number can not be null")
    @Size(min = 10, max = 10, message = "Phone number must contain 10 characters")
    @Pattern(regexp = "\\d{10}",message = "Phone number must contain only digits")
    private String phoneNumber;
    private String sellerFullName;
    private Boolean delivery;
    @NotNull(message = "City id can not be null")
    private Long cityId;
    @NotNull(message = "Category id can not be null")
    private Long categoryId;

}
