package az.mapacaademy.announcement.dto;

import lombok.Data;

@Data
public class CreateAnnouncementRequest {

    private String announcementName;
    private String announcementDescription;
    private Long announcementNumber;
    private Double price;
    private String phoneNumber;
    private String sellerFullName;
    private Boolean delivery;
    private Long cityId;
    private Long categoryId;

}
