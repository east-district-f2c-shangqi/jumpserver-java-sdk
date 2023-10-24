package com.jumpserver.sdk.v2.model;

/**
 * @author : Anneit
 * @version V1.0
 * @Project: jumpserver-sdk3
 * @Package com.jumpserver.sdk.v2.model
 * @Date : 2023年05月24日 下午3:33
 */

public class AccountTemplate {

    private  String id;

    private  String name;

    private  String username;
    private  String org_id;
    private  String org_name;

    private BaseDto secret_type;
    private Boolean privileged;
    private Boolean is_active;
    private Boolean auto_push;


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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BaseDto getSecret_type() {
        return secret_type;
    }

    public void setSecret_type(BaseDto secret_type) {
        this.secret_type = secret_type;
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

    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    public Boolean getAuto_push() {
        return auto_push;
    }

    public void setAuto_push(Boolean auto_push) {
        this.auto_push = auto_push;
    }


}
