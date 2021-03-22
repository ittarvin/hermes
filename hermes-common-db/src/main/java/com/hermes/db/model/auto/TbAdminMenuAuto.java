package com.hermes.db.model.auto;

import java.io.Serializable;
import java.util.Date;

public class TbAdminMenuAuto implements Serializable {
    private Integer id;

    private Date createDate;

    private String createUser;

    private Date updateDate;

    private String updateUser;

    private String menuName;

    private Integer menuType;

    private String menuPid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public TbAdminMenuAuto withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public TbAdminMenuAuto withCreateDate(Date createDate) {
        this.setCreateDate(createDate);
        return this;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public TbAdminMenuAuto withCreateUser(String createUser) {
        this.setCreateUser(createUser);
        return this;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public TbAdminMenuAuto withUpdateDate(Date updateDate) {
        this.setUpdateDate(updateDate);
        return this;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public TbAdminMenuAuto withUpdateUser(String updateUser) {
        this.setUpdateUser(updateUser);
        return this;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public TbAdminMenuAuto withMenuName(String menuName) {
        this.setMenuName(menuName);
        return this;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public Integer getMenuType() {
        return menuType;
    }

    public TbAdminMenuAuto withMenuType(Integer menuType) {
        this.setMenuType(menuType);
        return this;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    public String getMenuPid() {
        return menuPid;
    }

    public TbAdminMenuAuto withMenuPid(String menuPid) {
        this.setMenuPid(menuPid);
        return this;
    }

    public void setMenuPid(String menuPid) {
        this.menuPid = menuPid == null ? null : menuPid.trim();
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
        sb.append(", menuName=").append(menuName);
        sb.append(", menuType=").append(menuType);
        sb.append(", menuPid=").append(menuPid);
        sb.append("]");
        return sb.toString();
    }
}