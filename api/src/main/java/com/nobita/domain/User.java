package com.nobita.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * The data model for User.
 *
 * Created by yohei on 4/17/16.
 */
@Entity
public class User {

    enum Role {
        Staff,
        Admin
    }

    @Id
    @GeneratedValue
    private String id;

    @NotNull
    @Size(min = 1, max = 16)
    private String displayName;

    @NotNull
    private Role role;

    public User(String id, String displayName, Role role) {
        this.id = id;
        this.displayName = displayName;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Role getRole() {
        return role;
    }

}
