package com.issue.management.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "issuehistory")
public class IssueHistory extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "issue_id")
    private Issue issue;

    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Enumerated(EnumType.STRING)
    @JoinColumn(name = "issue_status")
    private IssueStatus issueStatus;

    private String details;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "assignee_user_id")
    private User assignee;

}
