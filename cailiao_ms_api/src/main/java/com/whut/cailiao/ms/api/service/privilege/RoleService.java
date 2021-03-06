package com.whut.cailiao.ms.api.service.privilege;

import com.whut.cailiao.ms.api.commons.ApiResponse;
import com.whut.cailiao.ms.api.model.privilege.Role;

import java.util.Set;

/**
 * Created by gammaniu on 16/4/18.
 */
public interface RoleService {

    ApiResponse getPrivilegeIdsByRoleId(Set<Integer> roleIds);

    ApiResponse createNewRole(Role role);

    ApiResponse getRoleList();

    ApiResponse deleteRoleById(int id);

    ApiResponse getRoleEditData(int id);

    ApiResponse updateRole(Role role);
}
