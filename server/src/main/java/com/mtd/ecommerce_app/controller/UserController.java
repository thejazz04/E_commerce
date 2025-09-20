package com.mtd.ecommerce_app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtd.ecommerce_app.dto.UpdateUserDto;
import com.mtd.ecommerce_app.entity.User;
import com.mtd.ecommerce_app.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/addUser")
    public User save(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }

    @GetMapping("/get/{id}")
    public User getUserByID(@PathVariable String id) {
        return userService.GetUserByID(id);
    }

    @PutMapping("/editUser/{id}")
    public User editUser(@RequestBody UpdateUserDto userDto, @PathVariable String id) {
        return userService.updateUser(id, userDto);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id) {
        return userService.deleteUser(id);
    }
}
