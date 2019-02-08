package com.mygroup.springbootcourse.controller;


import com.mygroup.springbootcourse.model.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private List<UserDTO> userDTOS = new ArrayList<>();

//    @RequestMapping(value = "/registry", method = RequestMethod.POST)
////    public ResponseEntity<UserDTO> registry(@RequestBody UserDTO user){
////        userDTOS.add(user);
////        return new ResponseEntity<>(user, HttpStatus.CREATED);
////    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(value = "/registry", method = RequestMethod.POST)
    public UserDTO registry(@RequestBody UserDTO userDTO){
        userDTOS.add(userDTO);
        return userDTO;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public UserDTO edit(@RequestBody UserDTO userDTO){
        return userDTO;

    }

    @RequestMapping(value = "/confirm", method = RequestMethod.PUT)
    public UserDTO confirm(@RequestParam(value = "id") Long id){
        System.out.println("confrimed");
        return new UserDTO();
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public UserDTO add(@RequestBody UserDTO userDTO){
        return userDTO;
    }
}
