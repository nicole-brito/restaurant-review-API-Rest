package com.codeacademy.diningreviewapi.controller;

import com.codeacademy.diningreviewapi.model.User;
import com.codeacademy.diningreviewapi.services.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping("/cadastro")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        try {
            User createdUser = userService.createUser(user);
            return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
        } catch (RuntimeException e) {
            log.error("Erro ao criar usuário", e);
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        try {
            User updateUser = userService.updateUser(user);
            return ResponseEntity.ok(updateUser);
        } catch (RuntimeException e) {
            log.error("Erro ao atualizar o usuário");
            return ResponseEntity.notFound().build();
        }
    }


}
