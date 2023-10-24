package com.jumpserver.sdk.v2.model;

/**
 * @author : Anneit
 * @version V1.0
 * @Project: jumpserver-sdk3
 * @Package com.jumpserver.sdk.v2.model
 * @Date : 2023年06月02日 下午5:05
 */

public class AccountTemplateUpdate {

    private String asset;

    private String name;

    private String username;

    private boolean privileged = false;

    private String secret_type;

    private String template;

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
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

    public boolean isPrivileged() {
        return privileged;
    }

    public void setPrivileged(boolean privileged) {
        this.privileged = privileged;
    }

    public String getSecret_type() {
        return secret_type;
    }

    public void setSecret_type(String secret_type) {
        this.secret_type = secret_type;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }
}
