package com.example.springcrud.controller;

import com.example.springcrud.model.User;
import com.example.springcrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable("id") long id) {
        List<User> users = userRepository.findAll();
        for(User u: users){
            if(u.getUser_id() == id){
                return u;
            }
        }
        return null;
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User entity) {
        return userRepository.save(entity);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable("id") long id, @RequestBody User u){
        User user = getUserById(id);
        if(u.getFirst_name() != null) {
            user.setFirst_name(u.getFirst_name());
        }
        if(u.getLast_name() != null) {
            user.setLast_name(u.getLast_name());
        }
        if(u.getAddress() != null) {
            user.setAddress(u.getAddress());
        }
        if(u.getPassword() != null) {
            user.setPassword(u.getPassword());
        }
        if(u.getEmail() != null) {
            user.setEmail(u.getEmail());
        }
        if(u.getPhone_number() != null) {
            user.setPhone_number(u.getPhone_number());
        }
        if(u.getUser_type() != null) {
            user.setUser_type(u.getUser_type());
        }
        return userRepository.save(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") long id){
         userRepository.delete(getUserById(id));
    }
}
