package com.example.instacat.facade;

import com.example.instacat.dto.UserDTO;
import com.example.instacat.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserFacade {

public UserDTO userToUserDTO(User user) {
    UserDTO userDTO = new UserDTO();
    userDTO.setId(user.getId());
    userDTO.setFirstname(user.getFirstname());
    userDTO.setLastname(user.getLastname());
    userDTO.setUsername(user.getUsername());
    userDTO.setInfo(user.getInfo());

    return userDTO;
}
}
