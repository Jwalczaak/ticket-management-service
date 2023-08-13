package com.tm.ticketmanagementservice.controllers;

import com.tm.ticketmanagementservice.controllers.Requests.UsersRequest;
import com.tm.ticketmanagementservice.models.Users;
import com.tm.ticketmanagementservice.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {


   private final UsersService usersService;

    @Autowired
    public AuthController(UsersService usersService){
        this.usersService = usersService;
    }

    @PostMapping("/user")
    public ResponseEntity<Users> getCurrentUser(@RequestBody Map<String, String> body) {
        String username = body.get("username");
        Optional<Users> user = usersService.getCurrentUser(username);
        return user.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
