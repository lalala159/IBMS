package com.example.demo1.entity;

import java.util.HashSet;
import java.util.Set;

public class Role {

    private  Integer rid;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    private  String name;
    private Set<Permission> permissions = new HashSet<>();
}
