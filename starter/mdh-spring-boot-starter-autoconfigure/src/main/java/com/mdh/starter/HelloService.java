package com.mdh.starter;

/**
 * @Author: madonghao
 * @Date: 2019/3/18 14:53
 */
public class HelloService {

    HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHello(String name){
        return helloProperties.getPrefix() + "-" + name + helloProperties.getSuffix();
    }
}
