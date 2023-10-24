package com.jumpserver.sdk.v2.model;

/**
 * @author : Anneit
 * @version V1.0
 * @Project: jumpserver-sdk
 * @Package com.jumpserver.sdk.v2.model
 * @Date : 2023年03月09日 下午2:33
 */

public class Account {

    private String id;
    private String name;
    private String username;
    private String secret_type;
    private String secret;
    private String passphrase;
    private String spec_info;
    private String created_by;
    private String comment;
    private String su_from;
    private AccountAsset asset;
    private Integer version;
    private String source;
    private String connectivity;
    private String org_id;
    private String org_name;
    private boolean has_secret;
    private boolean privileged;
    private boolean is_active;
    private String template;
    private boolean push_now;
    private String date_created;
    private String date_updated;

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

    public String getSecret_type() {
        return secret_type;
    }

    public void setSecret_type(String secret_type) {
        this.secret_type = secret_type;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }

    public String getSpec_info() {
        return spec_info;
    }

    public void setSpec_info(String spec_info) {
        this.spec_info = spec_info;
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

    public String getSu_from() {
        return su_from;
    }

    public void setSu_from(String su_from) {
        this.su_from = su_from;
    }

    public AccountAsset getAsset() {
        return asset;
    }

    public void setAsset(AccountAsset asset) {
        this.asset = asset;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
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

    public boolean isHas_secret() {
        return has_secret;
    }

    public void setHas_secret(boolean has_secret) {
        this.has_secret = has_secret;
    }

    public boolean isPrivileged() {
        return privileged;
    }

    public void setPrivileged(boolean privileged) {
        this.privileged = privileged;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public boolean isPush_now() {
        return push_now;
    }

    public void setPush_now(boolean push_now) {
        this.push_now = push_now;
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
}
