// package com.shobhit.auth.service.impl;

// import com.shobhit.auth.dto.UserDTO;
// import com.shobhit.auth.entity.User;
// import com.shobhit.auth.repository.UserRepository;
// import com.shobhit.auth.service.UserService;
// import com.shobhit.auth.util.MapperUtil;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;
// import java.util.stream.Collectors;

// @Service
// public class UserServiceImpl implements UserService {

//     @Autowired
//     private UserRepository userRepository;

//     @Override
//     public UserDTO createUser(UserDTO userDTO) {
//         User user = MapperUtil.toEntity(userDTO);
//         return MapperUtil.toDTO(userRepository.save(user));
//     }

//     @Override
//     public List<UserDTO> getAllUsers() {
//         return userRepository.findAll()
//                 .stream()
//                 .map(MapperUtil::toDTO)
//                 .collect(Collectors.toList());
//     }
// }
