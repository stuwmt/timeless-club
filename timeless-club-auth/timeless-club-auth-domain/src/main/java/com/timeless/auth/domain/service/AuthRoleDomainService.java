package com.timeless.auth.domain.service;

import com.timeless.auth.domain.entity.AuthRoleBO;

/**
 * 角色领域service
 */
public interface AuthRoleDomainService {

    Boolean add(AuthRoleBO authRoleBO);

    Boolean update(AuthRoleBO authRoleBO);

    Boolean delete(AuthRoleBO authRoleBO);

}
