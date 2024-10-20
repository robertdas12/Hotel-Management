package com.user.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

           @Id
          private  String userId;
          private  String name;
          private  String dob;
          private String email;
          @Column(length = 10)
          private String phone;

            @Transient
          private List<Rating> rating = new ArrayList<>();


}
