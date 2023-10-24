package com.jumpserver.sdk.v2.jumpserver.accounts;


import com.jumpserver.sdk.v2.common.ActionResponse;
import com.jumpserver.sdk.v2.model.Account;
import com.jumpserver.sdk.v2.model.AccountCreate;
import com.jumpserver.sdk.v2.model.AccountTemplate;
import com.jumpserver.sdk.v2.model.AccountTemplateUpdate;

import java.util.List;

/**
 * @author : Anneit
 * @version V1.0
 * @Project: jumpserver-sdk3
 * @Package com.jumpserver.sdk.v2.jumpserver.accounts
 * @Date : 2023年05月10日 上午10:30
 */

public interface AccountsService {

    List<Account> list();

    List<Account> createAccount(List<AccountCreate> account);

    Account updateAccount(Account account, String id);

    Account getAccount(String id);

    ActionResponse deleteAccount(String id);

    List<Account> getAccountsByAssetId(String assetId);


    // 账号模板
    List<AccountTemplate> listAccountTemplate();

    AccountTemplate getAccountTemplate(String id);

    Account createAccountByTemplate(AccountTemplateUpdate account);

}
