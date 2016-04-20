package com.whut.cailiao.impl.sevice.impl.privilege;

import com.whut.cailiao.api.commons.ApiResponse;
import com.whut.cailiao.api.commons.ApiResponseCode;
import com.whut.cailiao.api.model.user.Privilege;
import com.whut.cailiao.api.service.privilege.PrivilegeService;
import com.whut.cailiao.impl.dao.privilege.PrivilegeDao;
import com.whut.cailiao.impl.exception.TransactionExecuteException;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by gammaniu on 16/4/20.
 */
@Service("privilegeService")
public class PrivilegeServiceImpl implements PrivilegeService {

    @Autowired
    private PrivilegeDao privilegeDao;

    @Transactional
    @Override
    public ApiResponse create(List<Privilege> privileges) {
        ApiResponse response = ApiResponse.createDefaultApiResponse();
        if (CollectionUtils.isEmpty(privileges)) {
            response.setRetCode(ApiResponseCode.PARAM_ERROR);
            return response;
        }
        for (Privilege privilege : privileges) {
            if (privilege == null || privilege.getId() != null
                    || StringUtils.isBlank(privilege.getUrl())
                    || StringUtils.isBlank(privilege.getMethod())
                    || StringUtils.isBlank(privilege.getDescription())) {
                response.setRetCode(ApiResponseCode.PARAM_ERROR);
                return response;
            }
        }
        for (Privilege privilege : privileges) {
            this.privilegeDao.createNewPrivilege(privilege);
        }
        return response;
    }

    @Override
    public ApiResponse getList() {
        ApiResponse response = ApiResponse.createDefaultApiResponse();
        response.addBody("privilegeList", this.privilegeDao.getPrivilegeList());
        return response;
    }

    @Override
    public ApiResponse deleteById(int id) {
        ApiResponse response = ApiResponse.createDefaultApiResponse();
        if (id <= 0) {
            response.setRetCode(ApiResponseCode.PARAM_ERROR);
            return response;
        }
        this.privilegeDao.deleteById(id);
        return response;
    }
}
