package com.carpooling.carpoolingsystem.controller;

import com.carpooling.carpoolingsystem.model.User;
import com.carpooling.carpoolingsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")  // ✅ Changed from /users to /api
@CrossOrigin(origins = "http://127.0.0.1:5500")  // ✅ Allow frontend access (adjust if different port)
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // ✅ Register a new user
    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        userRepository.flush();  // Ensure ID is generated
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // ✅ Login endpoint
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User loginRequest) {
        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();

        User user = userRepository.findByEmail(email);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User not found");
        }

        if (!user.getPassword().equals(password)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid password");
        }

        return ResponseEntity.ok("Login successful for user: " + user.getUsername());
    }

    // ✅ Get all users
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userRepository.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
