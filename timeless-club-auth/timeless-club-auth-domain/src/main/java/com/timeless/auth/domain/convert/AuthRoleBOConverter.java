package com.timeless.auth.domain.convert;

import com.timeless.auth.domain.entity.AuthRoleBO;
import com.timeless.auth.domain.entity.AuthUserBO;
import com.timeless.auth.infra.basic.entity.AuthRole;
import com.timeless.auth.infra.basic.entity.AuthUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 角色bo转换器
 */
@Mapper
public interface AuthRoleBOConverter {

    AuthRoleBOConverter INSTANCE = Mappers.getMapper(AuthRoleBOConverter.class);

    AuthRole convertBOToEntity(AuthRoleBO authRoleBO);

}
