package com.issue.management.service;

import com.issue.management.entity.User;
import com.issue.management.entity.converter.UserEntitiyConverter;
import com.issue.management.entity.dto.CreateUserRequest;
import com.issue.management.entity.dto.UserDto;
import com.issue.management.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserEntitiyConverter userEntitiyConverter;

    public UserDto createUser(CreateUserRequest request) {
        User user = new User();
        user.setId(request.getId());
        user.setUsername(request.getUserName());

        userRepository.save(user);

        return userEntitiyConverter.toDto(user);
    }


    public List<UserDto> getAllUsers() {
        List<User> users = userRepository.findAll();
        List<UserDto> userDtos = new ArrayList<>();
        users.forEach(user -> {
            userDtos.add(userEntitiyConverter.toDto(user));
        });
        return userDtos;
    }

    public UserDto findUserById(Long userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        return userEntitiyConverter.toDto(userOptional.get());
    }

    public void deleteUserById(Long id){
        Optional<User> optionalUser = userRepository.findById(id);
        userRepository.deleteById(optionalUser.get().getId());
    }

}
