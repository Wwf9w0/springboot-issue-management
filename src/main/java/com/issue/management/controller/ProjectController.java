package com.issue.management.controller;

import com.issue.management.entity.Project;
import com.issue.management.entity.dto.CreateProjectRequest;
import com.issue.management.entity.dto.ProjectDto;
import com.issue.management.service.ProjectService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    @ApiOperation("Get All Project")
    public ResponseEntity<List<ProjectDto>> getAllProject(){
        return ResponseEntity.ok(projectService.getAllProject());
    }

    @GetMapping("/{id}")
    @ApiOperation("Get Project By Id")
    public ResponseEntity<ProjectDto> geyProjectById(@PathVariable Long id){
        return ResponseEntity.ok(projectService.getProjectById(id));
    }

    @DeleteMapping("{id}")
    @ApiOperation("Delete Project By Id")
    public ResponseEntity<Object> deleteProjectById(@PathVariable Long id){
        projectService.deleteProjectById(id);
        return ResponseEntity.ok().build();
    }
}
