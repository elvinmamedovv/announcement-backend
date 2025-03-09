package az.mapacaademy.announcement.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateAnnouncementRequest {
    @NotBlank(message = "Name can not be blank")
    private String announcementName;
    private String announcementDescription;
    @NotNull(message = "Price can not be null")
    @Min(value = 0, message = "Price must be greater than or equal to zero")
    private Double price;
    private String sellerFullName;
    private Boolean delivery;

}
