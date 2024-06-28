package com.example.demo.controller;

import com.example.demo.dto.request.ApiResponse;
import com.example.demo.dto.request.UserCreationRequest;
import com.example.demo.dto.request.UserUpdateRequest;
import com.example.demo.dto.response.UserResponse;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
  ApiResponse <User> createUser(@RequestBody @Valid UserCreationRequest request) {
       ApiResponse<User> apiResponse = new ApiResponse<>();
       apiResponse.setResult(userService.createUser(request));
        return apiResponse ;
    }

    @GetMapping
    List <User> getUsers() {
        return userService.getUser();
    }

    @GetMapping("/{userId1}")
    UserResponse getUser(@PathVariable String userId) {
        return userService.getUserById(userId);
    }


}
