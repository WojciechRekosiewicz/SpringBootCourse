package com.mygroup.springbootcourse.Controller;


import com.mygroup.springbootcourse.Model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @RequestMapping(value = "/")
    public String hehe(){
        return "FUCK YOU";
    }


    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        User user = new User();
        user.setFirstname("Janusz");
        user.setLastName("Tracz");
        return ("Hello " + user.getFirstname() + " " + user.getLastName());
    }
}
