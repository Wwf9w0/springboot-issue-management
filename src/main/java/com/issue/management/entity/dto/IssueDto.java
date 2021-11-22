package com.issue.management.entity.dto;

import com.issue.management.entity.IssueStatus;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class IssueDto {

    private Long id;
    private String description;
    private String details;
    private Date date;
    private IssueStatus issueStatus;
    private UserDto assignee;
    private ProjectDto project;
}
