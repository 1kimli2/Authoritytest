package org.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/login")
    public ResponseEntity<String> login() {
        return ResponseEntity.ok("Login successful");
    }

    @GetMapping("/hello")
    @PreAuthorize("hasRole('USER')") // 只有具有 'USER' 角色的用户才能访问
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello, User!");
    }

}