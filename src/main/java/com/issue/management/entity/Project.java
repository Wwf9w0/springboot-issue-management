package com.issue.management.entity;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "project")
public class Project extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String projectCode;
    private String projectName;

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_user_id")
    private User manager;
}
