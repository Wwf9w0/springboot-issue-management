package com.issue.management.service;

import com.issue.management.entity.Issue;
import com.issue.management.entity.converter.IssueEntityConverter;
import com.issue.management.entity.dto.IssueDto;
import com.issue.management.repository.IssueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class IssueService {

    private final IssueRepository issueRepository;
    private final IssueEntityConverter issueEntityConverter;

    public IssueDto save(Issue issue) {

        return null;
    }
}
