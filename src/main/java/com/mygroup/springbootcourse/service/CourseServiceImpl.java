package com.mygroup.springbootcourse.service;

import com.mygroup.springbootcourse.model.CourseDTO;

import com.mygroup.springbootcourse.persistence.model.Course;
import com.mygroup.springbootcourse.persistence.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;


public class CourseServiceImpl extends BaseServiceImpl<Course, Long, CourseRepo> implements CourseService {

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public CourseRepo getRepository(){
        return courseRepo;
    }

    @Override
    public CourseDTO getCourseDtoById(Long id){
        return Mapper.courseToDTO(getOne(id));
    }
}
