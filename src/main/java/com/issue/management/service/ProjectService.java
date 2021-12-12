package com.issue.management.service;

import com.issue.management.entity.Project;
import com.issue.management.entity.converter.ProjectEntityConverter;
import com.issue.management.entity.dto.ProjectDto;
import com.issue.management.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectRepository projectRepository;
    private final ProjectEntityConverter projectEntityConverter;


    public ProjectDto save(Project project) {
        Project projectCreate = new Project();
        projectCreate.setId(project.getId());
        projectCreate.setProjectCode(project.getProjectCode());
        projectCreate.setProjectName(project.getProjectName());
        projectCreate.setCreateAt(project.getCreateAt());
        projectCreate.setCreatedBy(project.getCreatedBy());
        projectCreate.setManager(project.getManager());
        projectCreate.setUpdateAt(project.getUpdateAt());
        projectCreate.setUpdateBy(project.getUpdateBy());

        projectRepository.save(projectCreate);

        return projectEntityConverter.toDto(projectCreate);
    }

    public List<ProjectDto> getAllProject() {
        List<Project> projects = projectRepository.findAll();
        List<ProjectDto> projectDtos = new ArrayList<>();
        projects.forEach(project -> {
            projectDtos.add(projectEntityConverter.toDto(project));
        });

        return projectDtos;
    }

    public ProjectDto getByIdProject(Long id) {
        Optional<Project> optionalProject = projectRepository.findById(id);
        return projectEntityConverter.toDto(optionalProject.get());
    }

    public void deleteProjectById(Long id) {
        Optional<Project> project = projectRepository.findById(id);
        projectRepository.deleteById(project.get().getId());
    }
}
