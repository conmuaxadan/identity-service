package com.raindrop.identity_service.service;

import com.raindrop.identity_service.dto.request.UserRequest;
import com.raindrop.identity_service.entity.User;
import com.raindrop.identity_service.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;

    public User createUser(UserRequest request) {
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setEmail(request.getEmail());
        return userRepository.save(user);
    }
}
