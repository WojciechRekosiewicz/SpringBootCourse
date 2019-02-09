package com.mygroup.springbootcourse.persistence.repository;

import com.mygroup.springbootcourse.persistence.model.BaseEntity;
import com.mygroup.springbootcourse.persistence.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface BaseRepository<T extends BaseEntity, K extends Serializable>
        extends JpaRepository<T, K>, JpaSpecificationExecutor<T> {
}
