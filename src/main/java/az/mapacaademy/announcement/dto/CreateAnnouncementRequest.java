package az.mapacaademy.announcement.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateAnnouncementRequest {

    @NotNull(message = "Name can not be null")
    private String announcementName;
    private String announcementDescription;
    @NotNull(message = "Price can not be null")
    private Double price;
    @NotNull(message = "Phone number can not be null")
    private String phoneNumber;
    private String sellerFullName;
    private Boolean delivery;
    private Long cityId;
    private Long categoryId;

}
