package com.ctun.structure.facade;


public class Memory implements IMechine{

    @Override
    public void start() {
        System.out.println("Memory供电开启");
        
    }

    @Override
    public void stop() {
       
        System.out.println("Memory断电关闭");
        
    }

}
