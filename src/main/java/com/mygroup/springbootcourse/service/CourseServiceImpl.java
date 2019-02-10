package com.mygroup.springbootcourse.service;

import com.mygroup.springbootcourse.model.CourseDTO;

import org.springframework.beans.factory.annotation.Autowired;
import com.mygroup.springbootcourse.persistence.model.Course;
import com.mygroup.springbootcourse.persistence.repository.CourseRepo;


public class CourseServiceImpl extends BaseServiceImpl<Course, Long, CourseRepo> implements CourseService {

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public CourseRepo getRepository(){ return courseRepo;}

    @Override
    public CourseDTO getCourseDtoById(Long id){
        return Mapper.courseToDTO(getOne(id));
    }

    @Override
    public CourseDTO createCourse(CourseDTO courseDTO) {
        Course c = save(Mapper.dtoToCourse(courseDTO));
        return Mapper.courseToDTO(c);
    }
}
