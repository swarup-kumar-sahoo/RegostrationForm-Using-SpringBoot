package com.client.user.Service;

import com.client.user.Entity.User;
import com.client.user.Repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    // Method to save the user
    public void saveUser(User user) {
        userRepository.save(user);
    }

}
