package com.ctun.structure.proxy;


public class Proxy implements ISeller{
    
    private ISeller factory = new Factory();

    @Override
    public void sell() {
        System.out.println("代理机构下订单");
        factory.sell();
        System.out.println("厂家通知代理机构已下订单");
    }

}
