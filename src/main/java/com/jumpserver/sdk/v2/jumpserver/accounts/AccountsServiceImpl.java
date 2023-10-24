package com.jumpserver.sdk.v2.jumpserver.accounts;

import com.alibaba.fastjson.JSON;
import com.jumpserver.sdk.v2.common.ActionResponse;
import com.jumpserver.sdk.v2.common.BaseJmsService;
import com.jumpserver.sdk.v2.common.ClientConstants;
import com.jumpserver.sdk.v2.model.*;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author : Anneit
 * @version V1.0
 * @Project: jumpserver-sdk3
 * @Package com.jumpserver.sdk.v2.jumpserver.accounts
 * @Date : 2023年05月10日 上午10:30
 */

public class AccountsServiceImpl extends BaseJmsService implements AccountsService {
    @Override
    public List<Account> list() {
        return get(Account.class, uri(ClientConstants.ACCOUNTS)).executeList();
    }


    @Override
    public List<Account> createAccount(List<AccountCreate> account) {
        checkNotNull(account);
        return post(Account.class, uri(ClientConstants.ACCOUNTS))
                .json(JSON.toJSONString(account))
                .executeList();
    }

    @Override
    public Account updateAccount(Account account, String id) {
        checkNotNull(account);
        checkNotNull(id);
//        return post(Account.class, uri(ClientConstants.ACCOUNTS))
//                .json(JSON.toJSONString(account))
//                .execute();

        return patch(Account.class, ClientConstants.ACCOUNTS, id, "/").json(JSON.toJSONString(account)).execute();
    }

    @Override
    public Account getAccount(String id) {
        checkNotNull(id);
        return get(Account.class, ClientConstants.ACCOUNTS, id, "/").execute();
    }

    @Override
    public ActionResponse deleteAccount(String id) {
        checkNotNull(id);
        return deleteWithResponse(ClientConstants.ACCOUNTS, id, "/").execute();
    }

    @Override
    public List<Account> getAccountsByAssetId(String assetId) {
        checkNotNull(assetId);
        String url = ClientConstants.ACCOUNTS + "?asset_id=" + assetId;
        return get(Account.class, url).executeList();
    }

    @Override
    public List<AccountTemplate> listAccountTemplate() {
        return get(AccountTemplate.class, uri(ClientConstants.ACCOUNT_TEMPLATES)).executeList();
    }

    @Override
    public AccountTemplate getAccountTemplate(String id) {
        checkNotNull(id);
        return get(AccountTemplate.class, ClientConstants.ACCOUNT_TEMPLATES, id, "/").execute();
    }


    @Override
    public Account createAccountByTemplate(AccountTemplateUpdate account) {
        checkNotNull(account);
        return post(Account.class, uri(ClientConstants.ACCOUNTS))
                .json(JSON.toJSONString(account))
                .execute();
    }
}
