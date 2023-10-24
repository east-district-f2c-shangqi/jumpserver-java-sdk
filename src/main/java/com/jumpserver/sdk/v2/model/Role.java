package com.jumpserver.sdk.v2.model;

import com.jumpserver.sdk.v2.model.entity.ModelEntity;

import java.util.Date;
import java.util.List;

public class Role implements ModelEntity {
    private String id;
    private String name;
    private String display_name;
    private String scope;
    private String users_amount;
    private boolean builtin;
    private String scope_display;
    private Date date_created;
    private Date date_updated;
    private String created_by;
    private String updated_by;
    private String comment;
    private List<Integer> permissions;
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }
    public String getDisplay_name() {
        return display_name;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
    public String getScope() {
        return scope;
    }

    public void setUsers_amount(String users_amount) {
        this.users_amount = users_amount;
    }
    public String getUsers_amount() {
        return users_amount;
    }

    public void setBuiltin(boolean builtin) {
        this.builtin = builtin;
    }
    public boolean getBuiltin() {
        return builtin;
    }

    public void setScope_display(String scope_display) {
        this.scope_display = scope_display;
    }
    public String getScope_display() {
        return scope_display;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }
    public Date getDate_created() {
        return date_created;
    }

    public void setDate_updated(Date date_updated) {
        this.date_updated = date_updated;
    }
    public Date getDate_updated() {
        return date_updated;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }
    public String getCreated_by() {
        return created_by;
    }

    public void setUpdated_by(String updated_by) {
        this.updated_by = updated_by;
    }
    public String getUpdated_by() {
        return updated_by;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getComment() {
        return comment;
    }

    public void setPermissions(List<Integer> permissions) {
        this.permissions = permissions;
    }
    public List<Integer> getPermissions() {
        return permissions;
    }

}
