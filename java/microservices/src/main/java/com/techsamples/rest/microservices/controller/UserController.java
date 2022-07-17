package com.techsamples.rest.microservices.controller;

import com.techsamples.rest.microservices.controller.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
public class UserController {

    @PostMapping(path = "/users", consumes = "application/json")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
        user.setId(1);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
