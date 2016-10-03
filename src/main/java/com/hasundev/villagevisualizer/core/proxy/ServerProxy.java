package com.hasundev.villagevisualizer.core.proxy;

public class ServerProxy implements IProxy {
    @Override
    public void init() {
        CommonProxy.init();
    }
}
