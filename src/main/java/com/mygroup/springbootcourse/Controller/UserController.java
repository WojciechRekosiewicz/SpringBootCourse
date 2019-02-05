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

//    @RequestMapping(value = "/registry", method = RequestMethod.POST)
////    public ResponseEntity<User> registry(@RequestBody User user){
////        users.add(user);
////        return new ResponseEntity<>(user, HttpStatus.CREATED);
////    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(value = "/registry", method = RequestMethod.POST)
    public User registry(@RequestBody User user){
        users.add(user);
        return user;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public User edit(@RequestBody User user){
        return user;

    }

    @RequestMapping(value = "/confirm", method = RequestMethod.PUT)
    public User confirm(@RequestParam(value = "id") Long id){
        System.out.println("confrimed");
        return new User();
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public User add(@RequestBody User user){
        return user;
    }
}
