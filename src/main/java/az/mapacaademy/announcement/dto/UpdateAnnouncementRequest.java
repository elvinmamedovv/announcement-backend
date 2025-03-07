package az.mapacaademy.announcement.dto;


import lombok.Data;

@Data
public class UpdateAnnouncementRequest {

    private String announcementName;
    private String announcementDescription;
    private Double price;
    private String sellerFullName;
    private Boolean delivery;

}
