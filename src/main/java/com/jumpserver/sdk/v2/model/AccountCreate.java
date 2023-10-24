package com.jumpserver.sdk.v2.model;

/**
 * @author : Ruanli
 * @version V1.0
 * @Project: jumpserver-sdk3
 * @Package com.jumpserver.sdk.v3.model
 * @Date : 2023年05月24日 下午3:33
 */

public class AccountCreate {

    private  String template;

    private  String name;

    private  String username;
    private  String secret_type;

    private Boolean privileged;

    private String asset;

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSecret_type() {
        return secret_type;
    }

    public void setSecret_type(String secret_type) {
        this.secret_type = secret_type;
    }

    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }
}
