package com.example.agapesistemas.controllers;

import com.example.agapesistemas.domain.user.RequestUser;
import com.example.agapesistemas.domain.user.UpdateUser;
import com.example.agapesistemas.domain.user.UserRepository;
import com.example.agapesistemas.domain.user.Users;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")

public class userController {
    @Autowired
    private UserRepository repository;
    @GetMapping
    public ResponseEntity getAllUsers(){
        var allUsers = repository.findAllByActiveTrue();
        return ResponseEntity.ok(allUsers);
    }
    @PostMapping
    public ResponseEntity registerUser(@RequestBody @Valid RequestUser data){
        Users newUserData = new Users(data);
        System.out.println(data);
        repository.save(newUserData);
        return ResponseEntity.ok().build();
    }
    @PutMapping
    @Transactional
    public ResponseEntity updateUser(@RequestBody @Valid UpdateUser data){
        Optional<Users> optionaluser = repository.findById(data.id());
        if (optionaluser.isPresent()) {
            Users user = optionaluser.get();
            user.setUserpass(data.userpass());
            return ResponseEntity.ok(user);
        }else {
            return  ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deleteUser(@PathVariable String id){
        Optional<Users> optionaluser = repository.findById(id);
        if (optionaluser.isPresent()) {
            Users user = optionaluser.get();
            user.setActive(false);
            return ResponseEntity.noContent().build();
        }else {
            return  ResponseEntity.notFound().build();
        }
    }
}
