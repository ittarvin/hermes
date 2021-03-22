package com.hermes.db.model.auto;

import java.io.Serializable;
import java.util.Date;

public class TbPlatformClientAuto implements Serializable {
    private Integer id;

    private Date createDate;

    private String createUser;

    private Date updateDate;

    private String updateUser;

    private String clientName;

    private String clientPhone;

    private String userId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public TbPlatformClientAuto withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public TbPlatformClientAuto withCreateDate(Date createDate) {
        this.setCreateDate(createDate);
        return this;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public TbPlatformClientAuto withCreateUser(String createUser) {
        this.setCreateUser(createUser);
        return this;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public TbPlatformClientAuto withUpdateDate(Date updateDate) {
        this.setUpdateDate(updateDate);
        return this;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public TbPlatformClientAuto withUpdateUser(String updateUser) {
        this.setUpdateUser(updateUser);
        return this;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public String getClientName() {
        return clientName;
    }

    public TbPlatformClientAuto withClientName(String clientName) {
        this.setClientName(clientName);
        return this;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public TbPlatformClientAuto withClientPhone(String clientPhone) {
        this.setClientPhone(clientPhone);
        return this;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone == null ? null : clientPhone.trim();
    }

    public String getUserId() {
        return userId;
    }

    public TbPlatformClientAuto withUserId(String userId) {
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
        sb.append(", clientName=").append(clientName);
        sb.append(", clientPhone=").append(clientPhone);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}