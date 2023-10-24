package com.jumpserver.sdk.v2.model;

/**
 * @author : Anneit
 * @version V1.0
 * @Project: jumpserver-sdk
 * @Package com.jumpserver.sdk.v2.model
 * @Date : 2023年03月09日 下午2:38
 */

public class AccountAsset {

    private String id;
    private String name;
    private String address;
    private String type;
    private String auto_info;
    private String category;
    private String platform;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuto_info() {
        return auto_info;
    }

    public void setAuto_info(String auto_info) {
        this.auto_info = auto_info;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
