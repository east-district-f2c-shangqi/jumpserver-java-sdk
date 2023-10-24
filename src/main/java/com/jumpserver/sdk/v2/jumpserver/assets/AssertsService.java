package com.jumpserver.sdk.v2.jumpserver.assets;

import com.jumpserver.sdk.v2.common.ActionResponse;
import com.jumpserver.sdk.v2.model.*;

import java.util.List;

/**
 * @author yankaijun
 * @date 2018/10/16 上午10:35
 */
public interface AssertsService {

    //节点
    List<AssetsNode> listAssetsNode();

    List<Asset> listAssetsByCategory(String category);


    AssetsNode getAssetsNode(String nodeId);

    AssetsNode updateAssetsNode(AssetsNode node);

    AssetsNode createAssetsNode(AssetsNode node);

    ActionResponse deleteAssetsNode(String nodeId);

    ActionResponse deleteAssetsNodeWithAssetCheck(String nodeId);

    List<Asset> getAssetsByNodeId(String nodeId);


    //节点下的节点
    AssetsNode createAssetsNodeChildren(AssetsNode node);

    AssetsNode createAssetsNodeChildren(String parentNodeId, AssetsNode node);

    List<AssetsNode> getAssetsNodeChildren(String parentNodeId);

    AssetsNode updateAssetsNodeChildren(String nodeId, AssetsNode node);

    List<AssetsNode> listAssetsNodeChildren();

    //资产
    List<Asset> list();

    List<Asset> listByHostname(String hostname);

    List<Asset> listByIp(String ip);

    Asset get(String assetId);

    Asset update(Asset asset);

    Asset create(Asset asset);

    ActionResponse delete(String assetId);

    //管理用户
    List<AdminUser> listAdminUser();

    AdminUser getAdminUser(String userId);

    AdminUser updateAdminUser(AdminUser adminuser);

    AdminUser createAdminUser(AdminUser adminuser);

    ActionResponse deleteAdminUser(String userId);

    AdminUser updateAdminUserAuthInfo(AdminUser adminuser);

    //系统用户
    List<SystemUser> listSystemUser();

    SystemUser getSystemUser(String userId);

    SystemUser updateSystemUser(SystemUser systemuser);

    SystemUser createSystemUser(SystemUser systemuser);

    ActionResponse deleteSystemUser(String userId);

    SystemUser updateSystemUserAuthInfo(SystemUser systemUser);

    SystemUser updateSystemUserPush(String userId);

    List<RemoteAppPermission> listRemoteAppPermissions();

    RemoteAppPermission createRemoteAppPermissions(RemoteAppPermission remoteAppPermission);

    RemoteAppPermission updateRemoteAppPermissions(RemoteAppPermission remoteAppPermission);

    List<RemoteApp> listRemoteApp();

    List<RemoteApp> listRemoteAppByCategory(String category);

    RemoteApp getRemoteApp(String appId);

    RemoteApp createRemoteApp(RemoteApp remoteApp);


}
