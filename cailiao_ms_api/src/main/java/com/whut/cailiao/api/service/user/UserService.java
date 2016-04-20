package com.whut.cailiao.api.service.user;

import com.whut.cailiao.api.commons.ApiResponse;
import com.whut.cailiao.api.model.user.Role;
import com.whut.cailiao.api.model.user.User;

import java.util.Set;

/**
 * Created by gammaniu on 16/4/18.
 */
public interface UserService {

    Set<Role> getRolesByAccount(String accountId);
    
    ApiResponse getUserList(int factoryId);

    ApiResponse deleteUserByAccountId(String accountId);

    ApiResponse createNewUser(User user);

    ApiResponse updateUser(User user);

    ApiResponse getUserByAccountId(String accountId);

}
