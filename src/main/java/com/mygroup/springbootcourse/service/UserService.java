package com.mygroup.springbootcourse.service;

import com.mygroup.springbootcourse.model.UserDTO;
import com.mygroup.springbootcourse.persistence.model.User;
import com.mygroup.springbootcourse.persistence.repository.UserRepo;

public interface UserService extends BaseService<User, Long, UserRepo> {

    public UserDTO createUser(UserDTO userDTO);

    public UserDTO editUser(UserDTO userDTO);
}