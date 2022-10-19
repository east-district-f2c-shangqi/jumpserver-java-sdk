package com.jumpserver.sdk.v2.model;

public class RemoteAppPermission {

    /**
     * id : 3fa85f64-5717-4562-b3fc-2c963f66afa6
     * name : string
     * category : db
     * type : mysql
     * is_active : true
     * date_expired : 2022-05-17T12:59:51.005Z
     * date_start : 2022-05-17T12:59:51.005Z
     * comment : string
     * users : ["3fa85f64-5717-4562-b3fc-2c963f66afa6"]
     * user_groups : ["3fa85f64-5717-4562-b3fc-2c963f66afa6"]
     * applications : ["3fa85f64-5717-4562-b3fc-2c963f66afa6"]
     * system_users : ["3fa85f64-5717-4562-b3fc-2c963f66afa6"]
     */

    private String id;
    private String name;
    private String category;
    private String type;
    private boolean is_active;
    private String date_expired;
    private String date_start;
    private String comment;
    private String[] users;
    private String[] user_groups;
    private String[] applications;
    private String[] system_users;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public String getDate_expired() {
        return date_expired;
    }

    public void setDate_expired(String date_expired) {
        this.date_expired = date_expired;
    }

    public String getDate_start() {
        return date_start;
    }

    public void setDate_start(String date_start) {
        this.date_start = date_start;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public String[] getApplications() {
        return applications;
    }

    public void setApplications(String[] applications) {
        this.applications = applications;
    }

    public String[] getSystem_users() {
        return system_users;
    }

    public void setSystem_users(String[] system_users) {
        this.system_users = system_users;
    }
}
