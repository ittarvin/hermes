package com.hermes.log.msg;


public class UserOperationLogVO {

    /**
     * 用户名
     */
    private String userName;

    /**
     * IP
     */
    private String ip;

    /**
     * 操作模块
     */
    private String model;

    /**
     * 操作类型
     */
    private Integer optType;

    /**
     * 请求参数
     */
    private String requestParams;

    /**
     * 类名
     */
    private String className;

    /**
     * 方法名
     */
    private String methodName;

    /**
     * 请求URI
     */
    private String requestUrl;

    /**
     * 异常名称
     */
    private String excName;

    /**
     * 异常信息
     */
    private String excInfo;

    /**
     * 响应时间
     */
    private Integer responseTime;

    /**
     * 系统标识
     */
    private Integer systemName;

    /**
     * 操作描述
     */
    private String desc;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getOptType() {
        return optType;
    }

    public void setOptType(Integer optType) {
        this.optType = optType;
    }

    public String getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(String requestParams) {
        this.requestParams = requestParams;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getExcName() {
        return excName;
    }

    public void setExcName(String excName) {
        this.excName = excName;
    }

    public String getExcInfo() {
        return excInfo;
    }

    public void setExcInfo(String excInfo) {
        this.excInfo = excInfo;
    }

    public Integer getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Integer responseTime) {
        this.responseTime = responseTime;
    }

    public Integer getSystemName() {
        return systemName;
    }

    public void setSystemName(Integer systemName) {
        this.systemName = systemName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
