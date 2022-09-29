package com.jumpserver.sdk.v2.model;

public class RemoteApp {

    /**
     * id : e6d688cf-96aa-4db0-9a74-26d581837f18
     * name : AT-PRD-OPENSTACK401
     * category : remote_app
     * category_display : 远程应用
     * type : chrome
     * type_display : Chrome
     * attrs : {"asset_info":{"id":"cfa5cedb-1a14-4e5d-8ef2-c1205434ccab","hostname":"RemoteApp_Navicat"},"asset":"cfa5cedb-1a14-4e5d-8ef2-c1205434ccab","path":"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe","chrome_target":"http://10.94.26.5/","chrome_username":"admin"}
     * date_created : 2021-06-11 18:14:13 +0800
     * date_updated : 2021-06-11 18:14:13 +0800
     * created_by : Administrator
     * comment :
     * domain : null
     * org_id : 744b4a5b-b93a-44bc-b2a2-c8993a9c42d3
     * org_name : 生产环境
     */

    private String id;
    private String name;
    private String category;
    private String category_display;
    private String type;
    private String type_display;
    private AttrsBean attrs;
    private String date_created;
    private String date_updated;
    private String created_by;
    private String comment;
    private Object domain;
    private String org_id;
    private String org_name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory_display() {
        return category_display;
    }

    public void setCategory_display(String category_display) {
        this.category_display = category_display;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType_display() {
        return type_display;
    }

    public void setType_display(String type_display) {
        this.type_display = type_display;
    }

    public AttrsBean getAttrs() {
        return attrs;
    }

    public void setAttrs(AttrsBean attrs) {
        this.attrs = attrs;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getDate_updated() {
        return date_updated;
    }

    public void setDate_updated(String date_updated) {
        this.date_updated = date_updated;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Object getDomain() {
        return domain;
    }

    public void setDomain(Object domain) {
        this.domain = domain;
    }

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public static class AttrsBean {
        /**
         * asset_info : {"id":"cfa5cedb-1a14-4e5d-8ef2-c1205434ccab","hostname":"RemoteApp_Navicat"}
         * asset : cfa5cedb-1a14-4e5d-8ef2-c1205434ccab
         * path : C:\Program Files (x86)\Google\Chrome\Application\chrome.exe
         * chrome_target : http://10.94.26.5/
         * chrome_username : admin
         */

        private AssetInfoBean asset_info;
        private String asset;
        private String path;
        private String chrome_target;
        private String chrome_username;

        public AssetInfoBean getAsset_info() {
            return asset_info;
        }

        public void setAsset_info(AssetInfoBean asset_info) {
            this.asset_info = asset_info;
        }

        public String getAsset() {
            return asset;
        }

        public void setAsset(String asset) {
            this.asset = asset;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getChrome_target() {
            return chrome_target;
        }

        public void setChrome_target(String chrome_target) {
            this.chrome_target = chrome_target;
        }

        public String getChrome_username() {
            return chrome_username;
        }

        public void setChrome_username(String chrome_username) {
            this.chrome_username = chrome_username;
        }

        public static class AssetInfoBean {
            /**
             * id : cfa5cedb-1a14-4e5d-8ef2-c1205434ccab
             * hostname : RemoteApp_Navicat
             */

            private String id;
            private String hostname;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getHostname() {
                return hostname;
            }

            public void setHostname(String hostname) {
                this.hostname = hostname;
            }
        }
    }
}
