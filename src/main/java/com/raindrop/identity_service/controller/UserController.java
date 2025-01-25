package com.raindrop.identity_service.controller;

import com.raindrop.identity_service.dto.request.UserRequest;
import com.raindrop.identity_service.entity.User;
import com.raindrop.identity_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    User createUser(@RequestBody UserRequest request) {
        return userService.createUser(request);
    }
}
