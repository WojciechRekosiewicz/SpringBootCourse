package com.mygroup.springbootcourse.Controller;

import com.mygroup.springbootcourse.Model.Course;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

    private List<Course> courses = new ArrayList<>();

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Course> createCourse(@RequestBody Course course){
        if (course.getId() == null || course.getId() < 0 ){
            throw new WrongIdException("Variable course have null id or id lower than 0");
        }
        courses.add(course);
        System.out.println(course.getName());
        System.out.println(course.getLengthInSecond());
        return new ResponseEntity<>(course, HttpStatus.CREATED);
    }


    @RequestMapping(value = "/available", method = RequestMethod.GET)
    public ResponseEntity<List<Course>> getAvailableCourses(){
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    @RequestMapping(value = "/buy/{id}", method = RequestMethod.POST)
    public Course buyCourse(@PathVariable(value = "id") Long id){
        System.out.println("buyCourse");
        return getCourse(id);
    }

    @RequestMapping(value = "/buy2", method = RequestMethod.POST)
    public Course buyCourse2(@RequestParam(value = "id") Long id){
        System.out.println("buyCourse2");
        return getCourse(id);

    }

    @RequestMapping(value = "/showall", method = RequestMethod.GET)
    public List<Course> showAllCourses(){
        return courses;
    }


    private Course getCourse(Long id) {
        Course course = null;
        for (Course c : courses){
            if(c.getId() !=null && c.getId().equals(id)){
                course = c;
                break;
            }
        }
        if (course==null){
        // TODO
        }
        return course;
    }

//    @RequestMapping(value = "/bought", method = RequestMethod.GET)
//    public ResponseEntity<List<Course>> getBoughtCourses(){
//        return new ResponseEntity<>(courses, HttpStatus.OK);
//    }

}
