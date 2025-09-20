package com.mtd.ecommerce_app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtd.ecommerce_app.dto.UpdateUserDto;
import com.mtd.ecommerce_app.entity.User;
import com.mtd.ecommerce_app.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        user.setId(null);
        return userRepository.save(user);
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User GetUserByID(String id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        return user;
    }

    public User updateUser(String id, UpdateUserDto userDto) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            User existingUser = optionalUser.get();
            existingUser.setStreet(userDto.getStreet());
            existingUser.setCity(userDto.getCity());
            existingUser.setZip(userDto.getZip());
            return userRepository.save(existingUser);
        } else {
            return null;
        }

    }

    public boolean deleteUser(String id) {
        Optional<User> optionalUser = userRepository.findByEmail(id);
        if (optionalUser.isEmpty()) {
            return false;
        }
        userRepository.deleteById(id);
        return true;
    }

}
