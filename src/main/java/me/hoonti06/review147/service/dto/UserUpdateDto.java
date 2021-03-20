package me.hoonti06.review147.service.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import me.hoonti06.review147.domain.Gender;
import me.hoonti06.review147.domain.User;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserUpdateDto {
    private Gender gender;
    private String hobby;

    @Builder
    private UserUpdateDto(Gender gender, String hobby) {
        this.gender = gender;
        this.hobby = hobby;
    }

    public void apply(User user) {
        user.update(gender, hobby);
    }
}
