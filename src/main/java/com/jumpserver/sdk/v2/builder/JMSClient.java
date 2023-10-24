package com.jumpserver.sdk.v2.builder;

import com.jumpserver.sdk.v2.jumpserver.accounts.AccountsService;
import com.jumpserver.sdk.v2.jumpserver.assets.AssertsService;
import com.jumpserver.sdk.v2.jumpserver.luna.LunaService;
import com.jumpserver.sdk.v2.jumpserver.org.OrgService;
import com.jumpserver.sdk.v2.jumpserver.permissions.PermissionService;
import com.jumpserver.sdk.v2.jumpserver.role.RoleService;
import com.jumpserver.sdk.v2.jumpserver.tickets.TicketsService;
import com.jumpserver.sdk.v2.jumpserver.users.UserService;

import java.util.Map;

public interface JMSClient {

    /**
     * API Key 信息
     *
     * @return
     */
    ApiKey getApiKey();

    /**
     * users 用户信息
     *
     * @return
     */
    UserService users();

    /**
     * assets 资产信息
     *
     * @return
     */
    AssertsService assets();

    /**
     * assets 资产信息
     *
     * @return
     */
    OrgService orgs();

    /**
     * luna 终端界面
     *
     * @return
     */
    LunaService luna();

    /**
     * permissions 授权规则
     *
     * @return
     */
    PermissionService permissions();

    /**
     * 获得请求头
     *
     * @return
     */
    Map getHeaders();

    /**
     * 角色信息
     * @return
     */
    RoleService roles();

    /**
     * 订单信息
     */
    TicketsService tickets();

    /**
     * 账户信息
     */
    AccountsService accounts();
}
