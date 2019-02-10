package com.mygroup.springbootcourse.controller;


import com.mygroup.springbootcourse.model.UserDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class Controller {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName("Marcin");
        return "Hello";
    }
}