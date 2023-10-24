package com.jumpserver.sdk.v2.model;

import java.util.List;

public class AssetsPermission {
    private String id;

    private String name;

    private String[] user_groups;

    private String[] users;

    private String[] assets;

    private String[] nodes;

    private String[] accounts;

    private String created_by;

    private String comment;

    private String org_id;

    private String org_name;

    private Boolean is_active;

    private Boolean is_valid;

    private Boolean is_expired;

    private Boolean from_ticket;

    private String date_expired;

    private String date_created;

    private String date_start;

    private List<BaseDto> actions;

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

    public String[] getUser_groups() {
        return user_groups;
    }

    public void setUser_groups(String[] user_groups) {
        this.user_groups = user_groups;
    }

    public String[] getUsers() {
        return users;
    }

    public void setUsers(String[] users) {
        this.users = users;
    }

    public String[] getAssets() {
        return assets;
    }

    public void setAssets(String[] assets) {
        this.assets = assets;
    }

    public String[] getNodes() {
        return nodes;
    }

    public void setNodes(String[] nodes) {
        this.nodes = nodes;
    }

    public String[] getAccounts() {
        return accounts;
    }

    public void setAccounts(String[] accounts) {
        this.accounts = accounts;
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

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    public Boolean getIs_valid() {
        return is_valid;
    }

    public void setIs_valid(Boolean is_valid) {
        this.is_valid = is_valid;
    }

    public Boolean getIs_expired() {
        return is_expired;
    }

    public void setIs_expired(Boolean is_expired) {
        this.is_expired = is_expired;
    }

    public Boolean getFrom_ticket() {
        return from_ticket;
    }

    public void setFrom_ticket(Boolean from_ticket) {
        this.from_ticket = from_ticket;
    }

    public String getDate_expired() {
        return date_expired;
    }

    public void setDate_expired(String date_expired) {
        this.date_expired = date_expired;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getDate_start() {
        return date_start;
    }

    public void setDate_start(String date_start) {
        this.date_start = date_start;
    }

    public List<BaseDto> getActions() {
        return actions;
    }

    public void setActions(List<BaseDto> actions) {
        this.actions = actions;
    }
}
