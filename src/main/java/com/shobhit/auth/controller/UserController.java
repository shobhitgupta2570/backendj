// package com.shobhit.auth.controller;

// import com.shobhit.auth.dto.UserDTO;
// import com.shobhit.auth.service.UserService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/users")
// public class UserController {

//     @Autowired
//     private UserService userService;

//     @PostMapping
//     public UserDTO createUser(@RequestBody UserDTO userDTO) {
//         return userService.createUser(userDTO);
//     }

//     @GetMapping
//     public List<UserDTO> getAllUsers() {
//         return userService.getAllUsers();
//     }
// }
