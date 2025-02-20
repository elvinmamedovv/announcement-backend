package az.mapacaademy.announcement.mapper;

import az.mapacaademy.announcement.dto.AnnouncementDto;
import az.mapacaademy.announcement.entity.Announcement;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
@RequiredArgsConstructor
public class AnnouncementMapper {
    private final CityMapper cityMapper ;
    private final CategoryMapper categoryMapper ;
    public AnnouncementDto toDto (Announcement announcement){
        AnnouncementDto announcementDto = new AnnouncementDto();
        announcementDto.setAnnuncementId(announcement.getAnnouncementId());
        announcementDto.setName(announcement.getAnnouncementName());
        announcementDto.setDescription(announcement.getAnnouncementDescription());
        announcementDto.setAnnouncementNumber(announcement.getAnnouncementNumber());
        announcementDto.setPrice(announcement.getPrice());
        announcementDto.setPhoneNumber(announcement.getPhoneNumber());
        announcementDto.setSellerFullName(announcement.getSellerName());
        announcementDto.setDelivery(announcement.getDelivery());
        announcementDto.setCreatedDate(announcement.getCreatedDate());
        announcementDto.setModifiedDate(announcement.getModifiedDate());
        announcementDto.setCity(cityMapper.toDto(announcement.getCity()));
        announcementDto.setCategory(categoryMapper.toDto(announcement.getCategory()));
        return announcementDto;
    }
    public List<AnnouncementDto> toDtoList (List<Announcement> announcements){
        return announcements.stream()
                .map(this::toDto)
                .toList();
    }
}
