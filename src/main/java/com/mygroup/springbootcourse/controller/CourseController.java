package com.mygroup.springbootcourse.controller;

import com.mygroup.springbootcourse.exception.WrongIdException;
import com.mygroup.springbootcourse.model.CourseDTO;
import com.mygroup.springbootcourse.persistence.model.Course;
import com.mygroup.springbootcourse.persistence.repository.CourseRepo;
import com.mygroup.springbootcourse.service.CourseService;
import com.mygroup.springbootcourse.service.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

    private List<CourseDTO> cours = new ArrayList<>();

    @Autowired
    CourseRepo courseRepo;


    CourseService courseService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<CourseDTO> createCourse(@RequestBody CourseDTO courseDTO){
        if (courseDTO.getId() == null || courseDTO.getId() < 0 ){
            throw new WrongIdException("Variable courseDTO have null id or id lower than 0");
        }
        cours.add(courseDTO);
        System.out.println(courseDTO.getName());
        System.out.println(courseDTO.getLengthInSecond());
        return new ResponseEntity<>(courseDTO, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/available", method = RequestMethod.GET)
    public ResponseEntity<List<CourseDTO>> getAvailableCourses(){
        return new ResponseEntity<>(cours, HttpStatus.OK);
    }


    @RequestMapping(value = "buy/{id}", method = RequestMethod.GET)
    public CourseDTO buyCourse(@PathVariable(value = "id") Long id){
        System.out.println("buyCourse");
        Course course = new Course();
        course.setName("cccl");
        courseService.save(course);
        return null;
    }

    @RequestMapping(value = "/buy2", method = RequestMethod.POST)
    public CourseDTO buyCourse2(@RequestParam(value = "id") Long id){
        System.out.println("buyCourse2");
        return getCourse(id);

    }

    @RequestMapping(value = "/showall", method = RequestMethod.GET)
    public List<CourseDTO> showAllCourses(){
        return cours;
    }


    private CourseDTO getCourse(Long id) {
        CourseDTO courseDTO = null;
        for (CourseDTO c : cours){
            if(c.getId() !=null && c.getId().equals(id)){
                courseDTO = c;
                break;
            }
        }
        if (courseDTO ==null){
        // TODO
        }
        return courseDTO;
    }

//    @RequestMapping(value = "/bought", method = RequestMethod.GET)
//    public ResponseEntity<List<CourseDTO>> getBoughtCourses(){
//        return new ResponseEntity<>(cours, HttpStatus.OK);
//    }

}
