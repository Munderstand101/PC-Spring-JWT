package com.munderstand.api.jwtrest.Repository;

import com.munderstand.api.jwtrest.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @created 29/11/2022 - 15:11
 * @project jwt-rest
 * @author Munderstand
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
