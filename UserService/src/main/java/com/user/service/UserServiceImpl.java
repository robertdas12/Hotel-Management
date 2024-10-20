package com.user.service;

import com.user.entity.User;
import com.user.globalException.ResourceNotFoundException;
import com.user.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class UserServiceImpl implements UserService{

  UserRepo repo;
  public UserServiceImpl(UserRepo repo) {
    this.repo = repo;
  }


  @Override
  public User createUser(User user) {
    String string = UUID.randomUUID().toString();
    user.setUserId(string);
    return this.repo.save(user);
  }

  @Override
  public List<User> getAllUser() {
    return this.repo.findAll();
  }

  @Override
  public User getUserById(String id) {
    return this.repo.findById(id).orElseThrow(()->new ResourceNotFoundException("the id which you have provided is not matching or not present in database"));
  }

  @Override
  public User updateUser(User user) {
    return null;
  }
}
