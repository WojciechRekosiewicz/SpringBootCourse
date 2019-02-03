package com.mygroup.springbootcourse;

import lombok.Data;

@Data
public class User {

    private String Firstname;
    private String lastName;
    private String email;
    private String password;
    private boolean author;
    private boolean admin;



}
