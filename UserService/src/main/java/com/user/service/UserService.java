package com.user.service;

import com.user.entity.User;

import java.util.List;

public interface UserService {

     public User  createUser(User user);

      public List<User> getAllUser();
      public User getUserById(String id);
     public User updateUser(User user);
}
