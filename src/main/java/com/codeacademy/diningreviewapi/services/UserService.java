package com.codeacademy.diningreviewapi.services;

import com.codeacademy.diningreviewapi.model.User;
import com.codeacademy.diningreviewapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        if (userRepository.existsByDisplayName(user.getDisplayName())) {
            throw new RuntimeException("Nome de usuário já está em uso");
        }
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        User existingUser = userRepository.findById(user.getId())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        existingUser.setCity(user.getCity());
        existingUser.setState(user.getState());
        existingUser.setZipcode(user.getZipcode());
        existingUser.setPeanutAllergic(user.getPeanutAllergic());
        existingUser.setEggAllergic(user.getEggAllergic());
        existingUser.setDairyAllergic(user.getDairyAllergic());
        return userRepository.save(existingUser);
    }

    public Optional<User> getUserByDisplayName(String displayName) {
        return userRepository.findUserByDisplayName(displayName);
    }

    public boolean userExists(String displayName) {
        return userRepository.existsByDisplayName(displayName);
    }
}