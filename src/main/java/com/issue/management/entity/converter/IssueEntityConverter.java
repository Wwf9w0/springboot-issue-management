package com.issue.management.entity.converter;

import com.issue.management.entity.Issue;
import com.issue.management.entity.dto.IssueDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class IssueEntityConverter {

    private final UserEntitiyConverter userEntitiyConverter;
    private final ProjectEntityConverter projectEntityConverter;

    public  IssueDto toDto(Issue issue){
        return IssueDto.builder()
                .id(issue.getId())
                .assignee(userEntitiyConverter.toDto(issue.getAssignee()))
                .date(issue.getDate())
                .issueStatus(issue.getIssueStatus())
                .description(issue.getDescription())
                .details(issue.getDetails())
                .project(projectEntityConverter.toDto(issue.getProject()))
                .build();
    }

}
