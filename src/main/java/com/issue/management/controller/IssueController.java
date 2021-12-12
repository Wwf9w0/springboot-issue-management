package com.issue.management.controller;

import com.issue.management.entity.Issue;
import com.issue.management.entity.dto.CreateIssueRequest;
import com.issue.management.entity.dto.IssueDto;
import com.issue.management.service.IssueService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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


}
