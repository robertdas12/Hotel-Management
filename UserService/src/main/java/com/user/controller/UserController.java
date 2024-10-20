package com.user.controller;


import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {


  UserService service;

  public UserController(UserService service) {     // construction injection is happening
    this.service = service;
  }




      @PostMapping("/create")
         public ResponseEntity<User> createUser(@RequestBody User user){
        User user1 = this.service.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
      }


      @GetMapping("/getById/{id}")
      public ResponseEntity<User> getUserById(@PathVariable String id){
        User byId = this.service.getUserById(id);
        return  ResponseEntity.ok(byId);
      }



      @GetMapping("/getAllUser")
      public ResponseEntity<List<User>>   getAllUser(){
        List<User> allUser = this.service.getAllUser();
         return ResponseEntity.of(Optional.ofNullable(allUser));
      }






}
