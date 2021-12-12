package com.issue.management.controller;

import com.issue.management.entity.Issue;
import com.issue.management.entity.dto.CreateIssueRequest;
import com.issue.management.entity.dto.IssueDto;
import com.issue.management.service.IssueService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1/api/issue")
public class IssueController {
    private final IssueService issueService;

    @GetMapping("/create")
    @ApiOperation("Create Issue")
    public ResponseEntity<IssueDto> createIssue (@RequestBody CreateIssueRequest createIssueRequest){
        return ResponseEntity.ok(issueService.save(createIssueRequest));
    }

    @GetMapping
    @ApiOperation("Get all Issues")
    public ResponseEntity<List<IssueDto>> getAllIssues(){
        return ResponseEntity.ok(issueService.getAllIssues());
    }

    @GetMapping("/{id}")
    @ApiOperation("Get Issue By Id")
    public ResponseEntity<IssueDto> getIssueById(@PathVariable Long id){
        return ResponseEntity.ok(issueService.getIssueById(id));
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Delete Issue By Id")
    public ResponseEntity<Object> deleteIssue(@PathVariable Long id){
        issueService.deleteIssue(id);
       return ResponseEntity.ok().build();
    }


}
