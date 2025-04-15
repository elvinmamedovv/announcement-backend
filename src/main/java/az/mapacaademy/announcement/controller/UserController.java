package az.mapacaademy.announcement.controller;


import az.mapacaademy.announcement.dto.AnnouncementResponse;
import az.mapacaademy.announcement.dto.BaseResponse;
import az.mapacaademy.announcement.dto.UserRegisterRequest;
import az.mapacaademy.announcement.dto.UserResponse;
import az.mapacaademy.announcement.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("sign-up")
    public BaseResponse<UserResponse> register(@RequestBody @Valid UserRegisterRequest request){
        var UserResponse = userService.create(request);
        BaseResponse<UserResponse> baseResponse = new BaseResponse<>();
        baseResponse.setData(UserResponse);
        return baseResponse;

    }


}
