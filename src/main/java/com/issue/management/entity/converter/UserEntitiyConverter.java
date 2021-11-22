package com.issue.management.entity.converter;


import com.issue.management.entity.User;
import com.issue.management.entity.dto.UserDto;

public class UserEntitiyConverter {

    public  UserDto toDto(User user){
        return UserDto.builder()
                .id(user.getId())
                .fullName(user.getUsername()+user.getUsername())
                .build();
    }
}
