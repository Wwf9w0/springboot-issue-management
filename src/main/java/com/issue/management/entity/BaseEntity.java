package com.issue.management.entity;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@MappedSuperclass
public class BaseEntity {

    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    private String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;

    private String updateBy;

    private Boolean status;

}
