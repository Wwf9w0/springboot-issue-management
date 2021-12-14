package com.issue.management.controller;

import com.issue.management.entity.dto.CreateProjectRequest;
import com.issue.management.entity.dto.ProjectDto;
import com.issue.management.service.ProjectService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1/api/project")
public class ProjectController {
    private final ProjectService projectService;

    @PostMapping("/create")
    @ApiOperation("Create Project")
    public ResponseEntity<ProjectDto> createProject(@RequestBody CreateProjectRequest request){
        return ResponseEntity.ok(projectService.save(request));
    }

    
}
