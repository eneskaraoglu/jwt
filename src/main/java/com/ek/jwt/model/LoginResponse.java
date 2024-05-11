package com.ek.jwt.model;

import lombok.Data;

@Data
public class LoginResponse {
	
    public LoginResponse(String email, String token) {
        this.email = email;
        this.token = token;
    }
    
	   private String email;
	   private String token;
}
