package az.mapacaademy.announcement.service;

import az.mapacaademy.announcement.dao.UserDao;
import az.mapacaademy.announcement.dto.UserRegisterRequest;
import az.mapacaademy.announcement.dto.UserResponse;
import az.mapacaademy.announcement.dto.UserUpdateRequest;
import az.mapacaademy.announcement.entity.User;
import az.mapacaademy.announcement.exception.NotFoundException;
import az.mapacaademy.announcement.mapper.UserMapper;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDao userDao;
    private final UserMapper userMapper;

    public UserResponse create(UserRegisterRequest request) {
        User user = userMapper.toUser(request);
        user= userDao.save(user);
        return userMapper.toUserResponse(user);
    }
    public UserResponse update(Long id, UserUpdateRequest request) {
        var user = userDao.findById(id)
                .orElseThrow(()-> new NotFoundException("User not found"));
        userMapper.populate(request,user);

        return userMapper.toUserResponse(user);
    }
}
