package com.hermes.db.model.auto;

import java.io.Serializable;
import java.util.Date;

public class TbAdminRoleMenuAuto implements Serializable {
    private Integer id;

    private Date createDate;

    private String createUser;

    private Date updateDate;

    private String updateUser;

    private Integer menuId;

    private Integer roleId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public TbAdminRoleMenuAuto withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public TbAdminRoleMenuAuto withCreateDate(Date createDate) {
        this.setCreateDate(createDate);
        return this;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public TbAdminRoleMenuAuto withCreateUser(String createUser) {
        this.setCreateUser(createUser);
        return this;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public TbAdminRoleMenuAuto withUpdateDate(Date updateDate) {
        this.setUpdateDate(updateDate);
        return this;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public TbAdminRoleMenuAuto withUpdateUser(String updateUser) {
        this.setUpdateUser(updateUser);
        return this;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Integer getMenuId() {
        return menuId;
    }

    public TbAdminRoleMenuAuto withMenuId(Integer menuId) {
        this.setMenuId(menuId);
        return this;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public TbAdminRoleMenuAuto withRoleId(Integer roleId) {
        this.setRoleId(roleId);
        return this;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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
        sb.append(", menuId=").append(menuId);
        sb.append(", roleId=").append(roleId);
        sb.append("]");
        return sb.toString();
    }
}