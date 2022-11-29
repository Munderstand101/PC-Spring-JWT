package com.munderstand.api.jwtrest.Form;

import lombok.Data;

/**
 * @author Munderstand
 * @created 29/11/2022 - 16:53
 * @project jwt-rest
 */
@Data
public class RoleToUserForm {
    private String username;
    private String roleName;
}
