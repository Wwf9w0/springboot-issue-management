package com.issue.management.service;

import com.issue.management.entity.Issue;
import com.issue.management.entity.User;
import com.issue.management.entity.converter.IssueEntityConverter;
import com.issue.management.entity.dto.CreateIssueRequest;
import com.issue.management.entity.dto.IssueDto;
import com.issue.management.repository.IssueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class IssueService {

    private final IssueRepository issueRepository;
    private final IssueEntityConverter issueEntityConverter;
    private final UserService userService;

    public IssueDto save(CreateIssueRequest issueRequest) {
        Issue issue = new Issue();
        issue.setId(issueRequest.getId());
        issue.setDescription(issueRequest.getDescription());
        issue.setDetails(issueRequest.getDetails());
        issueRepository.save(issue);
        return issueEntityConverter.toDto(issue);
    }


    public List<IssueDto> getAllIssues(){
        List<Issue> issues = issueRepository.findAll();
        List<IssueDto> issueDtos = new ArrayList<>();
        issues.forEach(issue -> {
            issueDtos.add(issueEntityConverter.toDto(issue));
        });
        return issueDtos;
    }
}
