package com.unifor.data_structures_problem.controller;

import com.unifor.data_structures_problem.model.User;
import com.unifor.data_structures_problem.dto.UserDTO;
import com.unifor.data_structures_problem.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@RequestBody UserDTO userDTO) {
        User user = new User(
                userDTO.name(),
                userDTO.cpf(),
                userDTO.phone(),
                userDTO.email()
        );
        userService.addUser(user);
    }

    @GetMapping("/{cpf}")
    public User getUserByCpf(@PathVariable String cpf) {
        return userService.getUserByCpf(cpf);
    }

    @GetMapping("/getAll")
    public Map<String, User> getAllUsers() {
        return userService.getAllUsers();
    }
}
