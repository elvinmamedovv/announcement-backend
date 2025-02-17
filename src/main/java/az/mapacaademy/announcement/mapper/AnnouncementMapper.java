package az.mapacaademy.announcement.mapper;

import az.mapacaademy.announcement.dto.AnnouncementDto;
import az.mapacaademy.announcement.entity.Announcement;

import java.util.List;
import java.util.stream.Collectors;

public class AnnouncementMapper {
    private final CityMapper cityMapper = new CityMapper();
    private final CategoryMapper categoryMapper = new CategoryMapper();
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
