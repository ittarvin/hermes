package com.hermes.log.constants;

public enum SystemTypeEnum {

    /**
     * 服务名称
     */
    SERVICE(0, "服务名称");



    private Integer type;
    private String name;

    SystemTypeEnum(Integer type, String name) {
        this.type = type;
        this.name = name;
    }

    public static String getSystem(Integer type) {
        String s = "";
        if (SERVICE.getType().equals(type)) {
            s = SERVICE.getName();
        }
        return s;
    }

    public Integer getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
