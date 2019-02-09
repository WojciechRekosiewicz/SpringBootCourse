package com.mygroup.springbootcourse.persistence.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Data
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id")
    private Long id;

    @Column(name = "acitve")
    private Boolean active;

    @Column(name = "created_date", updatable = false)
    private Date createdDate;

    @Column(name = "updated_date")
    private Date updatedDate;

    //Done before save to db
    @PrePersist
    protected void logDataBeforeInsert(){
        this.createdDate = new Date();
        this.updatedDate = new Date();
        this.active = true;
    }

    //Done before update date in db
    @PreUpdate
    protected void logDataBeforeUpdate(){
        this.updatedDate = new Date();
    }


}
