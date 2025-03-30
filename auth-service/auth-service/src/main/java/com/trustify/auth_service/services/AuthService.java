package com.trustify.auth_service.services;

import com.trustify.auth_service.entities.LoginUser;
import com.trustify.auth_service.entities.User;
import com.trustify.auth_service.repositories.AuthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private AuthRepo authRepo;

    public ResponseEntity<?> registerUser(User user){
        try {
            authRepo.save(user);
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }

    }
    public ResponseEntity<?> authenticatUser(LoginUser user){
        try {
            Optional<User> optionalUser=authRepo.findByEmail(user.getEmail());
            if(optionalUser.isEmpty()){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User Not FOund");
            }
            if(user.getPassword().equals(optionalUser.get().getPassword())){
                return ResponseEntity.status(HttpStatus.OK).body("Login SuccessFull");
            }
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Password Incorrect");

        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("server Error");
        }

    }
}
