package com.hermes.db.model.auto;

import java.io.Serializable;
import java.util.Date;

public class tbAdminMenuResourceAuto implements Serializable {
    private Integer id;

    private Date createDate;

    private String createUser;

    private Date updateDate;

    private String updateUser;

    private String resourceUrl;

    private Integer resourceType;

    private Integer menuId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public tbAdminMenuResourceAuto withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public tbAdminMenuResourceAuto withCreateDate(Date createDate) {
        this.setCreateDate(createDate);
        return this;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public tbAdminMenuResourceAuto withCreateUser(String createUser) {
        this.setCreateUser(createUser);
        return this;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public tbAdminMenuResourceAuto withUpdateDate(Date updateDate) {
        this.setUpdateDate(updateDate);
        return this;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public tbAdminMenuResourceAuto withUpdateUser(String updateUser) {
        this.setUpdateUser(updateUser);
        return this;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public tbAdminMenuResourceAuto withResourceUrl(String resourceUrl) {
        this.setResourceUrl(resourceUrl);
        return this;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl == null ? null : resourceUrl.trim();
    }

    public Integer getResourceType() {
        return resourceType;
    }

    public tbAdminMenuResourceAuto withResourceType(Integer resourceType) {
        this.setResourceType(resourceType);
        return this;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public tbAdminMenuResourceAuto withMenuId(Integer menuId) {
        this.setMenuId(menuId);
        return this;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
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
        sb.append(", resourceUrl=").append(resourceUrl);
        sb.append(", resourceType=").append(resourceType);
        sb.append(", menuId=").append(menuId);
        sb.append("]");
        return sb.toString();
    }
}