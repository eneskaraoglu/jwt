package com.ek.jwt.model;

import lombok.Data;

@Data
public class LoginRequest {
	
    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    private String email;
    private String password;
}
