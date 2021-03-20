package me.hoonti06.review147;

import me.hoonti06.review147.domain.Gender;
import me.hoonti06.review147.domain.UserRepository;
import me.hoonti06.review147.service.UserService;
import me.hoonti06.review147.service.dto.UserCreateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class InsertDbRunner implements ApplicationRunner {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        UserCreateDto userCreateDto = UserCreateDto.builder()
                .name("John Doe")
                .gender(Gender.MALE)
                .birthDate(LocalDate.of(2020, 2, 2))
                .hobby("game")
                .build();

        userRepository.save(userCreateDto.toEntity());

        userCreateDto = UserCreateDto.builder()
                .name("Jane Doe")
                .gender(Gender.FEMALE)
                .birthDate(LocalDate.of(1999, 12, 31))
                .build();

        userRepository.save(userCreateDto.toEntity());
    }
}
