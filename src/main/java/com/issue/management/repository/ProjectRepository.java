package com.issue.management.repository;

import com.issue.management.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

        List<Project> getAllByProjectCode(String projectCode);
        List<Project> getAllByProjectCodeAndIdNotNull(String projectCode);
        List<Project> getAllByProjectCodeAndProjectNameContains(String projectCode, String name);
}
