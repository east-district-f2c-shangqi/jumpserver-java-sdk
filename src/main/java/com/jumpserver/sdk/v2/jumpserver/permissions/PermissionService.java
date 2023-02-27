package com.jumpserver.sdk.v2.jumpserver.permissions;

import com.jumpserver.sdk.v2.common.ActionResponse;
import com.jumpserver.sdk.v2.model.AssetsPermission;

import java.util.List;

/**
 * @author yankaijun
 * @date 2018/10/16 上午10:34
 */
public interface PermissionService {

    List<AssetsPermission> list();

    List<AssetsPermission> listByHostnameAndUsername(String hostname, String username);

    AssetsPermission getAssetsPermission(String permissionId);

    AssetsPermission updateAssetsPermission(AssetsPermission assetspermission);

    AssetsPermission createAssetsPermission(AssetsPermission assetspermission);

    ActionResponse deleteAssetsPermission(String permissionId);

}
