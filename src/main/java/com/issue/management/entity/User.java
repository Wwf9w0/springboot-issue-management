package com.issue.management.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "user")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String password;
    private String surname;
    private String email;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "assignee_user_id")
    private List<Issue> issues;
}
