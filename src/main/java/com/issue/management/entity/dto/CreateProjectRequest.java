package com.issue.management.entity.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CreateProjectRequest {
    private Long id;
    private String projectName;
    private String projectCode;
}
