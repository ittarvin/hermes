package com.hermes.db.model.auto;

import java.io.Serializable;
import java.util.Date;

public class TbAdminRoleAuto implements Serializable {
    private Integer id;

    private Date createDate;

    private String createUser;

    private Date updateDate;

    private String updateUser;

    private String roleName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public TbAdminRoleAuto withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public TbAdminRoleAuto withCreateDate(Date createDate) {
        this.setCreateDate(createDate);
        return this;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public TbAdminRoleAuto withCreateUser(String createUser) {
        this.setCreateUser(createUser);
        return this;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public TbAdminRoleAuto withUpdateDate(Date updateDate) {
        this.setUpdateDate(updateDate);
        return this;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public TbAdminRoleAuto withUpdateUser(String updateUser) {
        this.setUpdateUser(updateUser);
        return this;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public TbAdminRoleAuto withRoleName(String roleName) {
        this.setRoleName(roleName);
        return this;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createDate=").append(createDate);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", roleName=").append(roleName);
        sb.append("]");
        return sb.toString();
    }
}