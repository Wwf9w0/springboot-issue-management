package com.issue.management.controller;

import com.issue.management.entity.User;
import com.issue.management.entity.dto.CreateUserRequest;
import com.issue.management.entity.dto.UserDto;
import com.issue.management.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1/api/user")
public class UserController {
    private final UserService userService;

    @GetMapping()
    public ResponseEntity<List<UserDto>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@RequestParam Long id){
        return ResponseEntity.ok(userService.findUserById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody CreateUserRequest request){
        return ResponseEntity.ok(userService.createUser(request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<UserDto> deleteUserById(@RequestParam Long id){
        userService.deleteUserById(id);
        return ResponseEntity.ok().build();
    }
}
