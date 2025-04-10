package com.timeless.auth.application.convert;

import com.timeless.auth.application.dto.AuthPermissionDTO;
import com.timeless.auth.application.dto.AuthRoleDTO;
import com.timeless.auth.domain.entity.AuthPermissionBO;
import com.timeless.auth.domain.entity.AuthRoleBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 权限dto转换器
 */
@Mapper
public interface AuthPermissionDTOConverter {

    AuthPermissionDTOConverter INSTANCE = Mappers.getMapper(AuthPermissionDTOConverter.class);

    AuthPermissionBO convertDTOToBO(AuthPermissionDTO authPermissionDTO);

}
