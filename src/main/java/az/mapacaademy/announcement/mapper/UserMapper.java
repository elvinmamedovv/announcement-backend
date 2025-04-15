package az.mapacaademy.announcement.mapper;

import az.mapacaademy.announcement.dto.UserRegisterRequest;
import az.mapacaademy.announcement.dto.UserResponse;
import az.mapacaademy.announcement.dto.UserUpdateRequest;
import az.mapacaademy.announcement.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.time.LocalDateTime;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface UserMapper {
    UserResponse toUserResponse(User user);
    @Mapping(target = "createdDate", constant = "java(getNow())")
    @Mapping(target = "modifiedDate", constant= "java(getNow())")
    @Mapping(target = "locked", constant = "false")
    @Mapping(target = "enabled", constant = "true")



    User toUser (UserRegisterRequest request);
    @Mapping(target = "modifiedDate", expression = "java(getNow())")

    void populate(UserUpdateRequest request, @MappingTarget User user);
    default LocalDateTime getNow() {
        return LocalDateTime.now();
    }
}
