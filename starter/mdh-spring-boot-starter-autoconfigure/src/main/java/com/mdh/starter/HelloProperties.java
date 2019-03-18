package com.mdh.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: madonghao
 * @Date: 2019/3/18 14:54
 */
@ConfigurationProperties(prefix = "mdh.hello")
public class HelloProperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
