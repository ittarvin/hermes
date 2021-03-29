package com.hermes.log.constants;


public enum OptTypeEnum {

    /**
     * 列表
     */
    LIST(0, "列表"),
    /**
     * 编辑
     */
    MODIFY(1, "编辑"),
    /**
     * 删除
     */
    DELETE(2, "删除");

    private Integer type;
    private String name;

    OptTypeEnum(Integer type, String name) {
        this.type = type;
        this.name = name;
    }

    public static String getOptType(Integer type) {
        String s = "";
        if (MODIFY.getType().equals(type)) {
            s = MODIFY.getName();
        } else if (DELETE.getType().equals(type)) {
            s = DELETE.getName();
        } else if (LIST.getType().equals(type)) {
            s = LIST.getName();
        }
        return s;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
