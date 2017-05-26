package com.ctun.structure.facade;


public class CPU implements IMechine{
    
    

    @Override
    public void start() {
        System.out.println("CPU供电开启");
        
    }

    @Override
    public void stop() {
       
        System.out.println("CPU断电关闭");
        
    }

}
