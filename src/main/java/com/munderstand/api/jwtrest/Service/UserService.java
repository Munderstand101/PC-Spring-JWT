package com.munderstand.api.jwtrest.Service;

import com.munderstand.api.jwtrest.Entity.Role;
import com.munderstand.api.jwtrest.Entity.User;

import java.util.List;

/**
 * @author Munderstand
 * @created 29/11/2022 - 15:22
 * @project jwt-rest
 */
public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
