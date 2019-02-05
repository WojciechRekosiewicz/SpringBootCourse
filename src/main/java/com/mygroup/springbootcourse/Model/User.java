package com.mygroup.springbootcourse.Model;

import lombok.Data;

@Data
public class User {

    private Long id;
    private String Firstname;
    private String lastName;
    private String email;
    private String password;
    private boolean author;
    private boolean admin;



}
