package com.issue.management.entity.dto;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class UserDto {

    private Long id;
    private String fullName;
}
