package com.hermes.db.model.auto;

import java.io.Serializable;
import java.util.Date;

public class TbPlatformClientChannelAuto implements Serializable {
    private Integer id;

    private Date createDate;

    private String createUser;

    private Date updateDate;

    private String updateUser;

    private Integer channelId;

    private String userId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public TbPlatformClientChannelAuto withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public TbPlatformClientChannelAuto withCreateDate(Date createDate) {
        this.setCreateDate(createDate);
        return this;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public TbPlatformClientChannelAuto withCreateUser(String createUser) {
        this.setCreateUser(createUser);
        return this;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public TbPlatformClientChannelAuto withUpdateDate(Date updateDate) {
        this.setUpdateDate(updateDate);
        return this;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public TbPlatformClientChannelAuto withUpdateUser(String updateUser) {
        this.setUpdateUser(updateUser);
        return this;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Integer getChannelId() {
        return channelId;
    }

    public TbPlatformClientChannelAuto withChannelId(Integer channelId) {
        this.setChannelId(channelId);
        return this;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getUserId() {
        return userId;
    }

    public TbPlatformClientChannelAuto withUserId(String userId) {
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
        sb.append(", channelId=").append(channelId);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}