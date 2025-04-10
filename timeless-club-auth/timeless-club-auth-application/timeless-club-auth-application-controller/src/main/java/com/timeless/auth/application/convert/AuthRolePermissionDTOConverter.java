package com.timeless.auth.application.convert;

import com.timeless.auth.application.dto.AuthPermissionDTO;
import com.timeless.auth.application.dto.AuthRolePermissionDTO;
import com.timeless.auth.domain.entity.AuthPermissionBO;
import com.timeless.auth.domain.entity.AuthRolePermissionBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 权限dto转换器
 */
@Mapper
public interface AuthRolePermissionDTOConverter {

    AuthRolePermissionDTOConverter INSTANCE = Mappers.getMapper(AuthRolePermissionDTOConverter.class);

    AuthRolePermissionBO convertDTOToBO(AuthRolePermissionDTO authRolePermissionDTO);

}
