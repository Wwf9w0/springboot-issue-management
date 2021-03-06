package com.issue.management.entity.converter;


import com.issue.management.entity.User;
import com.issue.management.entity.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserEntitiyConverter {

    public UserDto toDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .userName(user.getUsername() + user.getUsername())
                .build();
    }
}
