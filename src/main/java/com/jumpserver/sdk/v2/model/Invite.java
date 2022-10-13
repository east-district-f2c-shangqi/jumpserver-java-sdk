package com.jumpserver.sdk.v2.model;

import com.jumpserver.sdk.v2.model.entity.ModelEntity;
import java.util.List;

public class Invite implements ModelEntity {
    private List<String> org_roles;
    private List<String> users;

    public Invite() {
    }

    public void setOrg_roles(List<String> org_roles) {
        this.org_roles = org_roles;
    }

    public List<String> getOrg_roles() {
        return this.org_roles;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public List<String> getUsers() {
        return this.users;
    }
}
