package org.src.user.service;

import org.src.user.model.User;
import org.src.user.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;
    private final PasswordHasher passwordHasher;

    public UserService(UserRepository userRepository, PasswordHasher passwordHasher) {
        this.userRepository = userRepository;
        this.passwordHasher = passwordHasher;
    }

    public boolean registerUser(String username, String password, String role) {
        if (userRepository.exists(username)){
            System.out.println("User already exists");
            return false;
        }
        String hashedPassword = passwordHasher.hashPassword(password);
        User newUser = new User(username, hashedPassword, role);
        userRepository.save(newUser);
        return true;
    }

    public boolean authenticateUser(String username, String password) {
        User user = userRepository.findByUsername(username);
        return user != null && passwordHasher.verifyPassword(password, user.getPassword());
    }

    public boolean authorizeUser(String username, String requiredRole) {
        User user = userRepository.findByUsername(username);
        return  user != null && user.getRole().equals(requiredRole);
    }
}
