package com.jumpserver.sdk.v2.model;

public class RemoteAppPermission {
    private String id;

    private String name;

    private String comment;

    private boolean is_active;

    private String date_start;

    private String date_expired;

    private boolean is_valid;

    private String created_by;

    private String date_created;

    private String[] users;

    private String[] user_groups;

    private String[] remote_apps;

    private String[] system_users;

    private Integer users_amount;

    private Integer user_groups_amount;

    private Integer remote_apps_amount;

    private Integer system_users_amount;

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public String getDate_start() {
        return date_start;
    }

    public void setDate_start(String date_start) {
        this.date_start = date_start;
    }

    public String getDate_expired() {
        return date_expired;
    }

    public void setDate_expired(String date_expired) {
        this.date_expired = date_expired;
    }

    public boolean isIs_valid() {
        return is_valid;
    }

    public void setIs_valid(boolean is_valid) {
        this.is_valid = is_valid;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String[] getUsers() {
        return users;
    }

    public void setUsers(String[] users) {
        this.users = users;
    }

    public String[] getUser_groups() {
        return user_groups;
    }

    public void setUser_groups(String[] user_groups) {
        this.user_groups = user_groups;
    }

    public String[] getRemote_apps() {
        return remote_apps;
    }

    public void setRemote_apps(String[] remote_apps) {
        this.remote_apps = remote_apps;
    }

    public String[] getSystem_users() {
        return system_users;
    }

    public void setSystem_users(String[] system_users) {
        this.system_users = system_users;
    }

    public Integer getUsers_amount() {
        return users_amount;
    }

    public void setUsers_amount(Integer users_amount) {
        this.users_amount = users_amount;
    }

    public Integer getUser_groups_amount() {
        return user_groups_amount;
    }

    public void setUser_groups_amount(Integer user_groups_amount) {
        this.user_groups_amount = user_groups_amount;
    }

    public Integer getRemote_apps_amount() {
        return remote_apps_amount;
    }

    public void setRemote_apps_amount(Integer remote_apps_amount) {
        this.remote_apps_amount = remote_apps_amount;
    }

    public Integer getSystem_users_amount() {
        return system_users_amount;
    }

    public void setSystem_users_amount(Integer system_users_amount) {
        this.system_users_amount = system_users_amount;
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
}
