package com.trustify.auth_service.controllers;

import com.trustify.auth_service.entities.LoginUser;
import com.trustify.auth_service.entities.User;
import com.trustify.auth_service.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth-service")
public class AuthController {
    @Autowired
    private AuthService authService;



    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody User user){

        return authService.registerUser(user);
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginUser user){
        return authService.authenticatUser(user);

    }
}
