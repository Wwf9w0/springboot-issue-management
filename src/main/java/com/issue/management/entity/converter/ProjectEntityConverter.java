package com.issue.management.entity.converter;

import com.issue.management.entity.Project;
import com.issue.management.entity.dto.ProjectDto;
import org.springframework.stereotype.Component;

@Component
public class ProjectEntityConverter {

    public ProjectDto toDto(Project project){

        return ProjectDto.builder()
                .id(project.getId())
                .getProjectCode(project.getProjectCode())
                .projectName(project.getProjectName())
                .build();
    }
}
