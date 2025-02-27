package az.mapacaademy.announcement.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AnnouncementResponse {
    private Long announcementId;
    private String announcementName;
    private String announcementDescription;
    private Long announcementNumber;
    private Double price;
    private String phoneNumber;
    private String sellerFullName;
    private Boolean delivery;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private CityDto city;
    private CategoryDto category;



}
