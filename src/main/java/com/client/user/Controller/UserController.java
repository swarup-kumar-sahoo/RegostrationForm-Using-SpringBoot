package com.client.user.Controller;

import com.client.user.Entity.User;
import com.client.user.Repository.UserRepository;
import com.client.user.Service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    @ResponseBody
    public String saveUser(@RequestParam String name, @RequestParam String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);

        // Call the service to save the user
        userService.saveUser(user);

        return "User saved successfully!";
    }

}
