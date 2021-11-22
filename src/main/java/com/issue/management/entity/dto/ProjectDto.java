package com.issue.management.entity.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProjectDto {

    private Long id;
    private String projectName;
    private String getProjectCode;
}
