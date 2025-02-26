package az.mapacaademy.announcement.dto;

import az.mapacaademy.announcement.entity.Category;
import az.mapacaademy.announcement.entity.City;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AnnouncementDto {

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
