package com.mygroup.springbootcourse.service;

import com.mygroup.springbootcourse.model.CourseDTO;
import com.mygroup.springbootcourse.persistence.model.Course;
import com.mygroup.springbootcourse.persistence.repository.CourseRepo;

public interface CourseService extends BaseService<Course, Long, CourseRepo> {

    CourseDTO getCourseDtoById(Long id);

}


