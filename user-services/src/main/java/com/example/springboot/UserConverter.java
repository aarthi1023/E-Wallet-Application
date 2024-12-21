package com.example.springboot;

public class UserConverter {
    public static User userConverter(UserRequestDto userRequestDto) {
        return User.builder()
                .userName(userRequestDto.getUserName())
                .name(userRequestDto.getName())
                .email(userRequestDto.getEmail())
                .mobile(userRequestDto.getMobile())
                .build();
    }
}