package com.jumpserver.sdk.v2.jumpserver.role;


import com.jumpserver.sdk.v2.common.BaseJmsService;
import com.jumpserver.sdk.v2.common.ClientConstants;
import com.jumpserver.sdk.v2.model.Role;

import java.util.List;

public class RoleServiceImpl extends BaseJmsService implements RoleService {
    @Override
    public List<Role> list() {
        return get(Role.class, uri(ClientConstants.ROLES)).executeList();
    }
}
