package com.hermes.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("white.path")
public class WhitePathConfig {

    String list;

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }
}
