package me.hoonti06.review147.api.controller.dto;

import lombok.Getter;
import me.hoonti06.review147.domain.Gender;
import me.hoonti06.review147.service.dto.UserUpdateDto;

import javax.validation.constraints.NotNull;

@Getter
public class UserUpdateV1 {

    @NotNull(message = "성별은 필수입니다.")
    private Gender gender;

    private String hobby;

    public UserUpdateDto toDto() {
        return UserUpdateDto.builder()
                .gender(gender)
                .hobby(hobby)
                .build();
    }
}
