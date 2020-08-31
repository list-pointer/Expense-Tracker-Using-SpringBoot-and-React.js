package com.expensetracker.MainPackage.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        super();
        this.userRepo = userRepo;
    }

    @GetMapping("/users")
    Collection<User> users() {
        return userRepo.findAll();
    }
}

