package me.hoonti06.review147.api.controller;

import lombok.RequiredArgsConstructor;
import me.hoonti06.review147.api.controller.dto.UserCreateV1;
import me.hoonti06.review147.api.controller.dto.UserUpdateV1;
import me.hoonti06.review147.response.ApiResponseDto;
import me.hoonti06.review147.service.UserService;
import me.hoonti06.review147.service.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class UserControllerV1 {

    @Autowired
    private final UserService userService;

    @PostMapping("/v1/users")
    public ApiResponseDto<UserDto> signUp(@Valid @RequestBody UserCreateV1 create) {
        return ApiResponseDto.createOK(userService.signUp(create.toDto()));
    }

    @PutMapping("/v1/users/{id}")
    public ApiResponseDto<UserDto> update(@PathVariable("id") Long id,
                                          @Valid @RequestBody UserUpdateV1 update) {
        return ApiResponseDto.createOK(userService.update(id, update.toDto()));
    }

}
