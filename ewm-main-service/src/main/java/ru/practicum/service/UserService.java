package ru.practicum.service;

import ru.practicum.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto addUser(UserDto dto);

    void deleteUserById(Long userId);

    List<UserDto> searchAllUsers(List<Long> ids, Integer from, Integer size);

}
