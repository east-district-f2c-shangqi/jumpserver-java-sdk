package com.jumpserver.sdk.v2.jumpserver.assets;

import com.alibaba.fastjson.JSON;
import com.jumpserver.sdk.v2.common.ActionResponse;
import com.jumpserver.sdk.v2.common.BaseJmsService;
import com.jumpserver.sdk.v2.common.ClientConstants;
import com.jumpserver.sdk.v2.model.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author yankaijun
 * @date 2018/10/16 上午10:35
 */
public class AssertsServiceImpl extends BaseJmsService implements AssertsService {

    //资产节点
    @Override
    public List<AssetsNode> listAssetsNode() {
        return get(AssetsNode.class, uri(ClientConstants.NODES)).executeList();
    }

    @Override
    public AssetsNode getAssetsNode(String nodeId) {
        checkNotNull(nodeId);
        return get(AssetsNode.class, ClientConstants.NODES, nodeId, "/").execute();
    }


    public List<Asset> getAssetsByNodeId(String nodeId) {
        checkNotNull(nodeId);
        String url = ClientConstants.NODES_ASSETS.replace("{id}", nodeId);
        List<Asset> assetList = get(Asset.class, url).executeList();
        return assetList;
    }

    @Override
    public ActionResponse deleteAssetsNode(String nodeId) {
        checkNotNull(nodeId);
        return deleteWithResponse(ClientConstants.NODES_ASSETS, nodeId, "/").execute();
    }

    @Override
    public ActionResponse deleteAssetsNodeWithAssetCheck(String nodeId) {
        checkNotNull(nodeId);
        //patch node assets to empty
        String url = ClientConstants.NODES_ASSETS.replace("{id}", nodeId);
        String removeUrl = ClientConstants.NODES_ASSETS_REMOVE.replace("{id}", nodeId);
        try {
            List<Asset> assetList = get(Asset.class, url).executeList();
            if (assetList.size() > 0) {
                List<String> idList = assetList.stream().map(Asset::getId).collect(Collectors.toList());
                String[] objects = idList.stream().toArray(String[]::new);
                Map<String, String[]> map = new HashMap<>(1);
                map.put("assets", objects);
                patch(JSON.class, removeUrl).json(JSON.toJSONString(map)).execute();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deleteWithResponse(ClientConstants.NODES, nodeId, "/").execute();
    }

    @Override
    public AssetsNode updateAssetsNode(AssetsNode assetsnode) {
        checkNotNull(assetsnode);
        return patch(AssetsNode.class, ClientConstants.NODES, assetsnode.getId(), "/").json(JSON.toJSONString(assetsnode)).execute();
    }

    @Override
    public AssetsNode createAssetsNode(AssetsNode assetsnode) {
        checkNotNull(assetsnode);
        return post(AssetsNode.class, ClientConstants.NODES)
                .json(JSON.toJSONString(assetsnode))
                .execute();
    }

    //节点下的子节点
    @Override
    public AssetsNode createAssetsNodeChildren(AssetsNode node) {
        checkNotNull(node);
        return post(AssetsNode.class, ClientConstants.NODES_CHILDREN)
                .json(JSON.toJSONString(node))
                .execute();
    }

    @Override
    public AssetsNode createAssetsNodeChildren(String parentNodeId, AssetsNode node) {
        checkNotNull(node);
        String url = ClientConstants.NODES_ID_CHILDREN.replace("{id}", parentNodeId);
        return post(AssetsNode.class, url)
                .json(JSON.toJSONString(node))
                .execute();
    }

    @Override
    public AssetsNode updateAssetsNodeChildren(String nodeId, AssetsNode node) {
        checkNotNull(nodeId);
        checkNotNull(node);
        return patch(AssetsNode.class, ClientConstants.NODES_CHILDREN_ADD, nodeId)
                .json(JSON.toJSONString(node)).execute();
    }

    @Override
    public List<AssetsNode> listAssetsNodeChildren() {
        return get(AssetsNode.class, ClientConstants.NODES_CHILDREN).executeList();
    }

    //资产
    @Override
    public List<Asset> list() {
        return get(Asset.class, ClientConstants.ASSETS).executeList();
    }

    @Override
    public Asset get(String assetId) {
        checkNotNull(assetId);
        return get(Asset.class, ClientConstants.ASSETS, assetId, "/").execute();
    }

    @Override
    public ActionResponse delete(String assetId) {
        checkNotNull(assetId);
        return deleteWithResponse(ClientConstants.ASSETS, assetId, "/").execute();
    }

    @Override
    public Asset update(Asset asset) {
        checkNotNull(asset);
        return patch(Asset.class, ClientConstants.ASSETS, asset.getId(), "/").json(JSON.toJSONString(asset)).execute();
    }

    @Override
    public Asset create(Asset asset) {
        checkNotNull(asset);
        return post(Asset.class, uri(ClientConstants.ASSETS))
                .json(JSON.toJSONString(asset))
                .execute();
    }

    //管理用户
    @Override
    public List<AdminUser> listAdminUser() {
        return get(AdminUser.class, uri(ClientConstants.ADMIN_USERS)).executeList();
    }

    @Override
    public AdminUser getAdminUser(String userId) {
        checkNotNull(userId);
        return get(AdminUser.class, ClientConstants.ADMIN_USERS, userId, "/").execute();
    }

    @Override
    public ActionResponse deleteAdminUser(String userId) {
        checkNotNull(userId);
        return deleteWithResponse(ClientConstants.ADMIN_USERS, userId, "/").execute();
    }

    @Override
    public AdminUser updateAdminUser(AdminUser adminuser) {
        checkNotNull(adminuser);
        return patch(AdminUser.class, ClientConstants.ADMIN_USERS, adminuser.getId(), "/").json(JSON.toJSONString(adminuser)).execute();
    }

    @Override
    public AdminUser createAdminUser(AdminUser adminuser) {
        checkNotNull(adminuser);
        return post(AdminUser.class, uri(ClientConstants.ADMIN_USERS))
                .json(JSON.toJSONString(adminuser))
                .execute();
    }

    @Override
    public AdminUser updateAdminUserAuthInfo(AdminUser adminUser) {
        String url = ClientConstants.ADMIN_USERS_AUTH.replace("{id}", adminUser.getId());
        return patch(AdminUser.class, url).json(JSON.toJSONString(adminUser)).execute();
    }

    //系统用户
    @Override
    public List<SystemUser> listSystemUser() {
        return get(SystemUser.class, uri(ClientConstants.SYSTEM_USERS)).executeList();
    }

    @Override
    public SystemUser getSystemUser(String userId) {
        checkNotNull(userId);
        return get(SystemUser.class, ClientConstants.SYSTEM_USERS, userId, "/").execute();
    }

    @Override
    public ActionResponse deleteSystemUser(String userId) {
        checkNotNull(userId);
        return deleteWithResponse(ClientConstants.SYSTEM_USERS, userId, "/").execute();
    }

    @Override
    public SystemUser updateSystemUserAuthInfo(SystemUser systemUser) {
        String url = ClientConstants.SYSTEM_USERS_AUTHINFO.replace("{id}", systemUser.getId());
        return patch(SystemUser.class, url).json(JSON.toJSONString(systemUser)).execute();
    }

    @Override
    public SystemUser updateSystemUserPush(String userId) {
        checkNotNull(userId);
        return get(SystemUser.class, ClientConstants.SYSTEM_USERS_PUSH, userId, "/").execute();
    }

    @Override
    public SystemUser updateSystemUser(SystemUser systemuser) {
        checkNotNull(systemuser);
        return patch(SystemUser.class, ClientConstants.SYSTEM_USERS, systemuser.getId(), "/").json(JSON.toJSONString(systemuser)).execute();
    }

    @Override
    public SystemUser createSystemUser(SystemUser systemuser) {
        checkNotNull(systemuser);
        return post(SystemUser.class, uri(ClientConstants.SYSTEM_USERS))
                .json(JSON.toJSONString(systemuser))
                .execute();
    }


    @Override
    public List<RemoteAppPermission> listRemoteAppPermissions() {
        return get(RemoteAppPermission.class, uri(ClientConstants.REMOTE_APP_PERMISSIONS)).executeList();

    }

    @Override
    public RemoteAppPermission createRemoteAppPermissions(RemoteAppPermission remoteAppPermission) {
        checkNotNull(remoteAppPermission);
        return post(RemoteAppPermission.class, uri(ClientConstants.REMOTE_APP_PERMISSIONS)).json(JSON.toJSONString(remoteAppPermission))
                .execute();

    }


    @Override
    public RemoteAppPermission updateRemoteAppPermissions(RemoteAppPermission remoteAppPermission) {
        checkNotNull(remoteAppPermission);
        return patch(RemoteAppPermission.class, uri(ClientConstants.REMOTE_APP_PERMISSIONS)).json(JSON.toJSONString(remoteAppPermission))
                .execute();

    }


    @Override
    public List<RemoteApp> listRemoteApp() {
        return get(RemoteApp.class, uri(ClientConstants.REMOTE_APP)).executeList();

    }


    @Override
    public RemoteApp getRemoteApp(String appId) {
        String url = ClientConstants.REMOTE_APP_ID.replace("{id}", appId);
        return get(RemoteApp.class, url).execute();
    }
}
