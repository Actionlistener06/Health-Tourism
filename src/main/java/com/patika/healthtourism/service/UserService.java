package com.patika.healthtourism.service;

import com.patika.healthtourism.database.entity.RoleEntity;
import com.patika.healthtourism.database.entity.UserEntity;
import com.patika.healthtourism.database.repository.RoleEntityRepository;
import com.patika.healthtourism.database.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    UserEntityRepository userRepository;
    @Autowired
    RoleEntityRepository roleRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    public void saveUserByRole(UserEntity user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        Set<RoleEntity> roles = new HashSet<>();
        roles.add(roleRepository.findByName(user.getUsername()).get());
        user.setRoles(roles);
        userRepository.save(user);
    }
}
