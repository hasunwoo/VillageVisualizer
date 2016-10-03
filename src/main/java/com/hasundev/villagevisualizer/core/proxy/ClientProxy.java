package com.hasundev.villagevisualizer.core.proxy;

public class ClientProxy implements IProxy {

    @Override
    public void init() {
        CommonProxy.init();
    }
}
