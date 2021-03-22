package com.hermes.db.model.auto;

import java.io.Serializable;
import java.util.Date;

public class TbAdminUserRoleAuto implements Serializable {
    private Integer id;

    private Date createDate;

    private String createUser;

    private Date updateDate;

    private String updateUser;

    private Integer roleId;

    private String userId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public TbAdminUserRoleAuto withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public TbAdminUserRoleAuto withCreateDate(Date createDate) {
        this.setCreateDate(createDate);
        return this;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public TbAdminUserRoleAuto withCreateUser(String createUser) {
        this.setCreateUser(createUser);
        return this;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public TbAdminUserRoleAuto withUpdateDate(Date updateDate) {
        this.setUpdateDate(updateDate);
        return this;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public TbAdminUserRoleAuto withUpdateUser(String updateUser) {
        this.setUpdateUser(updateUser);
        return this;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public TbAdminUserRoleAuto withRoleId(Integer roleId) {
        this.setRoleId(roleId);
        return this;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUserId() {
        return userId;
    }

    public TbAdminUserRoleAuto withUserId(String userId) {
        this.setUserId(userId);
        return this;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
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
        sb.append(", roleId=").append(roleId);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}