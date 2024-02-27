package com.boas.rian.springcourse.resources;

import com.boas.rian.springcourse.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "ria", "ria@gmail.com", "5151", "1234");

        return ResponseEntity.ok(u);
    }
}
