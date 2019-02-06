package com.mygroup.springbootcourse.Controller;


import com.mygroup.springbootcourse.Model.UserDTO;
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
        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName("Janusz");
        userDTO.setLastName("Tracz");
        return ("Hello " + userDTO.getFirstName() + " " + userDTO.getLastName());
    }
}
