package com.ctun.structure.facade;


public class HardDisk implements IMechine{

    @Override
    public void start() {
        System.out.println("HardDisk供电开启");
        
    }

    @Override
    public void stop() {
       
        System.out.println("HardDisk断电关闭");
        
    }

}
