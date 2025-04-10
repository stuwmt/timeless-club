package com.timeless.auth.domain.service;

import com.timeless.auth.domain.entity.AuthPermissionBO;
import com.timeless.auth.domain.entity.AuthRolePermissionBO;

/**
 * 角色领域service
 */
public interface AuthRolePermissionDomainService {

    Boolean add(AuthRolePermissionBO authRolePermissionBO);

}
