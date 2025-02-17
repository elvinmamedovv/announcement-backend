package az.mapacaademy.announcement.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data

public class Announcement {
    private Long announcementId;
    private String announcementName;
    private String announcementDescription;
    private Long announcementNumber;
    private Double price;
    private String phoneNumber;
    private String sellerName;
    private Boolean delivery;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private City city;
    private Category category;



}
