package com.hermes.db.model.auto;

import java.io.Serializable;
import java.util.Date;

public class TbPlatformChannelAuto implements Serializable {
    private Integer id;

    private Date createDate;

    private String createUser;

    private Date updateDate;

    private String updateUser;

    private String channelName;

    private Integer channelStatus;

    private Integer channelSort;

    private String channelPageAddr;

    private String channelDataAddr;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public TbPlatformChannelAuto withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public TbPlatformChannelAuto withCreateDate(Date createDate) {
        this.setCreateDate(createDate);
        return this;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public TbPlatformChannelAuto withCreateUser(String createUser) {
        this.setCreateUser(createUser);
        return this;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public TbPlatformChannelAuto withUpdateDate(Date updateDate) {
        this.setUpdateDate(updateDate);
        return this;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public TbPlatformChannelAuto withUpdateUser(String updateUser) {
        this.setUpdateUser(updateUser);
        return this;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public String getChannelName() {
        return channelName;
    }

    public TbPlatformChannelAuto withChannelName(String channelName) {
        this.setChannelName(channelName);
        return this;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public Integer getChannelStatus() {
        return channelStatus;
    }

    public TbPlatformChannelAuto withChannelStatus(Integer channelStatus) {
        this.setChannelStatus(channelStatus);
        return this;
    }

    public void setChannelStatus(Integer channelStatus) {
        this.channelStatus = channelStatus;
    }

    public Integer getChannelSort() {
        return channelSort;
    }

    public TbPlatformChannelAuto withChannelSort(Integer channelSort) {
        this.setChannelSort(channelSort);
        return this;
    }

    public void setChannelSort(Integer channelSort) {
        this.channelSort = channelSort;
    }

    public String getChannelPageAddr() {
        return channelPageAddr;
    }

    public TbPlatformChannelAuto withChannelPageAddr(String channelPageAddr) {
        this.setChannelPageAddr(channelPageAddr);
        return this;
    }

    public void setChannelPageAddr(String channelPageAddr) {
        this.channelPageAddr = channelPageAddr == null ? null : channelPageAddr.trim();
    }

    public String getChannelDataAddr() {
        return channelDataAddr;
    }

    public TbPlatformChannelAuto withChannelDataAddr(String channelDataAddr) {
        this.setChannelDataAddr(channelDataAddr);
        return this;
    }

    public void setChannelDataAddr(String channelDataAddr) {
        this.channelDataAddr = channelDataAddr == null ? null : channelDataAddr.trim();
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
        sb.append(", channelName=").append(channelName);
        sb.append(", channelStatus=").append(channelStatus);
        sb.append(", channelSort=").append(channelSort);
        sb.append(", channelPageAddr=").append(channelPageAddr);
        sb.append(", channelDataAddr=").append(channelDataAddr);
        sb.append("]");
        return sb.toString();
    }
}