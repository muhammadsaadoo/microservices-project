package com.trustify.auth_service.entities;

import lombok.Data;

@Data
public class LoginUser {
    private String email;
    private String password;
}
