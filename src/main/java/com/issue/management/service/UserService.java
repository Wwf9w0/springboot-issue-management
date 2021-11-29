package com.issue.management.service;

import com.issue.management.entity.User;
import com.issue.management.entity.converter.UserEntitiyConverter;
import com.issue.management.entity.dto.UserDto;
import com.issue.management.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserEntitiyConverter userEntitiyConverter;

    public UserDto createUser(User user) {
        return userEntitiyConverter.toDto(userRepository.save(user));
    }


    public User findUserById(Long userId){
        return userRepository.findById(userId).orElseThrow(NoSuchFieldError::new);
    }

}
