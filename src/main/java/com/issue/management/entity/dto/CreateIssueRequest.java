package com.issue.management.entity.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@RequiredArgsConstructor
public class CreateIssueRequest {

    private Long id;
    private String description;
    private String details;
  //  private UserDto assignee;
}
