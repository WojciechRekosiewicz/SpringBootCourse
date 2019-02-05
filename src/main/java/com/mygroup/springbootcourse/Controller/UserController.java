package com.mygroup.springbootcourse.Controller;


import com.mygroup.springbootcourse.Model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private List<User> users = new ArrayList<>();

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<User> registry(@RequestBody User user){
        users.add(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);


    }

    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public void edit(){


    }

    @RequestMapping(value = "/confirm", method = RequestMethod.POST)
    public void confirm(){

    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public User add(@RequestParam(value = "id" + "id2") Long id, Long id2){
        System.out.println("buyCourse");
        CourseController courseController = new CourseController();
        courseController.buyCourse2(id2);
        System.out.println(courseController.buyCourse2(id2));
        return getUser(id);
    }

    private User getUser(Long id) {
        User user = null;
        for (User u : users){
                if(u.getId() !=null && u.getId().equals(id)){
                    user = u;
                    break;
                }
            }
            if (user==null){
                // TODO
            }
            return user;
        }
}
