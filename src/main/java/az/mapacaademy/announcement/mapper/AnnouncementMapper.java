package az.mapacaademy.announcement.mapper;

import az.mapacaademy.announcement.dto.CreateAnnouncementRequest;
import az.mapacaademy.announcement.dto.AnnouncementResponse;
import az.mapacaademy.announcement.dto.UpdateAnnouncementRequest;
import az.mapacaademy.announcement.entity.Announcement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring")
public interface AnnouncementMapper {
    AnnouncementResponse toResponse(Announcement announcement);

    List<AnnouncementResponse> toResponseList(List<Announcement> announcements);


    @Mapping(target = "announcementNumber", expression = "java(generateAnnouncementNumber() )")
    @Mapping(source="cityId", target = "city.cityId")
    @Mapping(source = "categoryId", target = "category.categoryId")
    Announcement toEntity(CreateAnnouncementRequest request);
    Announcement toEntity(Long announcementId,UpdateAnnouncementRequest request);

    default Long generateAnnouncementNumber() {
        double d = Math.random() * 100000000;
        return (long) d;
    }


}
