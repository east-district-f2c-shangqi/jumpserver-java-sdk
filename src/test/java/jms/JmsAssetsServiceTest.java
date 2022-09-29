package jms;

import com.jumpserver.sdk.v2.common.ActionResponse;
import com.jumpserver.sdk.v2.model.*;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 资产API调用相关测试用例
 */
public class JmsAssetsServiceTest extends CommonBeforeTest {

    private String assetId = "8e83ca4b-ca16-435c-a4a4-6dc8e204ca30";

//    @Test
//    public void addAsset() {
//        Asset asset = new Asset();
//        asset.setId(assetId);
//        asset.setIp("192.168.20.102");
//        asset.setHostname("欧洲十国游");
//        Asset assetnew = os.assets().create(asset);
//        System.out.println(assetnew.getId());
//    }

    @Test
    public void getAsset() {
        Asset asset = os.assets().get(assetId);
        String[] nodes = asset.getNodes();
        if (nodes != null && nodes.length > 0) {
            List<String> list = new ArrayList<>();
            for (String node : nodes) {
                if (!list.contains(node)) {
                    list.add(node);
                }
            }
            String[] nodeList = new String[list.size()];
            asset.setNodes(list.toArray(nodeList));
        } else {
            asset.setNodes(new String[]{""});
        }
        os.assets().update(asset);
        System.out.println(asset.getHostname());
        System.out.println(asset.getAdmin_user());
    }

    @Test
    public void assets() {
        List<Asset> assetList = os.assets().list();
        System.out.println("assets size: " + assetList.size());
        for (Asset asset : assetList) {
            System.out.println(asset.getId());
            System.out.println(asset.getIp());
            System.out.println(asset.getHostname());
            System.out.println(StringUtils.join(asset.getNodes()));
        }
    }

//    @Test
//    public void updateAsset() {
//        Asset asset = new Asset();
//        asset.setId(assetId);
//        asset.setIp("192.168.20.102");
//        asset.setHostname("欧洲十一国游");
//        Asset assetnew = os.assets().update(asset);
//        System.out.println(assetnew.getId());
//    }

//    @Test
//    public void deleteAsset() {
//        ActionResponse delete = os.assets().delete(assetId);
//        System.out.println(delete);
//    }

    //=========================== 资产树 =============================
//    @Test
//    public void addAssetsNode() {
//        AssetsNode object = new AssetsNode();
//        object.setId(assetId);
//        object.setValue("演示工作空间-son");
//        AssetsNode objectBack = os.assets().createAssetsNode(object);
//        System.out.println(objectBack.getId());
//    }

//    @Test
//    public void addAssetsNodeChildren() {
//        AssetsNode object = new AssetsNode();
//        object.setId(assetId);
//        object.setValue("演示工作空间-son");
//        AssetsNode objectBack = os.assets().createAssetsNodeChildren("e3ced244-5f1a-4c5f-bec4-ebd163fe1e81",object);
//        System.out.println(objectBack.getId());
//    }

    @Test
    public void getAssetsNode() {
        List<AssetsNode> object = os.assets().listAssetsNode();

        System.out.println(object);
    }

//    @Test
//    public void updateAssetsNode() {
//        AssetsNode object = new AssetsNode();
//        object.setId(assetId);
//        object.setValue("123");
//        AssetsNode objectBack = os.assets().updateAssetsNode(object);
//        System.out.println(objectBack.getId());
//    }

    @Test
    public void AssetsNodes() {
        List<AssetsNode> list = os.assets().listAssetsNode();
        System.out.println(list.size());
        for (AssetsNode object : list) {
            System.out.println(object.getId());
            System.out.println(object.getTree_parent());
            System.out.println(object.getValue());
            System.out.println(object.getIs_node());
        }
    }

//    @Test
//    public void deleteAssetsNode() {
//        ActionResponse delete = os.assets().deleteAssetsNode(assetId);
//        System.out.println(delete);
//    }


    @Test
    public void listRemoteAppPermissions() {
        List<RemoteAppPermission> list = os.assets().listRemoteAppPermissions();
        System.out.println(list.size());
        for (RemoteAppPermission object : list) {
            System.out.println(object.getId());
            System.out.println(object.getName());
        }
    }

//    @Test
//    public void createRemoteAppPermissions() {
//
//    }

    @Test
    public void listRemoteApp() {
//        os.getHeaders().put("x-jms-org", "744b4a5b-b93a-44bc-b2a2-c8993a9c42d3");
        List<RemoteApp> list = os.assets().listRemoteApp();
        System.out.println(list.size());
        for (RemoteApp object : list) {
            System.out.println(object.getId());
            System.out.println(object.getName());
        }

    }

}
