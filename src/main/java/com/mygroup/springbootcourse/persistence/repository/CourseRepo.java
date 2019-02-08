package com.mygroup.springbootcourse.persistence.repository;

import com.mygroup.springbootcourse.persistence.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CourseRepo extends JpaRepository<Course, Long>, JpaSpecificationExecutor<Course> {

}
