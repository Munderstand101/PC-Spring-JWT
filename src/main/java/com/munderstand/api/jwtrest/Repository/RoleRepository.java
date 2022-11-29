package com.munderstand.api.jwtrest.Repository;

import com.munderstand.api.jwtrest.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @created 29/11/2022 - 15:10
 * @project jwt-rest
 * @author Munderstand
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
