package com.ek.jwt.reposities;

import org.springframework.stereotype.Repository;

import com.ek.jwt.model.User;

@Repository
public class UserRepository {
    public User findUserByEmail(String email){
        User user = new User(email,"123456");
        user.setFirstName("FirstName");
        user.setLastName("LastName");
        return user;
    }
}