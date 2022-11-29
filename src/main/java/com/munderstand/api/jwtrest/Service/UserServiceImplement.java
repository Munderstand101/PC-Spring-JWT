package com.munderstand.api.jwtrest.Service;

import com.munderstand.api.jwtrest.Entity.Role;
import com.munderstand.api.jwtrest.Entity.User;
import com.munderstand.api.jwtrest.Repository.RoleRepository;
import com.munderstand.api.jwtrest.Repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Munderstand
 * @created 29/11/2022 - 15:34
 * @project jwt-rest
 */
@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImplement implements UserService{

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public User saveUser(User user) {
        log.info("Save new user {} to the database", user.getUsername());
        return userRepository.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Save new role {} to the database", role.getName());
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("Adding role {} to user {}", username,roleName);
        User user = userRepository.findByUsername(username);
        Role role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        log.info("Fetching user {}", username);
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        log.info("Fetching all users");
        return userRepository.findAll();
    }
}
