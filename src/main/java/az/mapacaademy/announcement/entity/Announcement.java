package az.mapacaademy.announcement.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "announcements")
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long announcementId;
    @Column(name = "name")
    private String announcementName;
    @Column(name= "description")
    private String announcementDescription;
    private Long announcementNumber;
    private Double price;
    private String phoneNumber;
    private String sellerFullName;
    private Boolean delivery;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    @JoinColumn(name = "city_id", referencedColumnName = "city_id")
    @ManyToOne
    private City city;
    @JoinColumn(name ="category_id", referencedColumnName = "category_id")
    @ManyToOne
    private Category category;



}
