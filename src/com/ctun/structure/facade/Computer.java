package com.ctun.structure.facade;


public class Computer implements IMechine{
    
    private CPU cpu = new CPU();
    
    private Memory Memory = new Memory();
    
    private HardDisk hardDisk = new HardDisk(); 

    @Override
    public void start() {
        System.out.println("Computer开始开机......");
        cpu.start();
        Memory.start();
        hardDisk.start();
        System.out.println("CPU供电开启");
        
    }

    @Override
    public void stop() {
        System.out.println("Computer开始关机......");
        cpu.stop();
        Memory.stop();
        hardDisk.stop();
        System.out.println("HardDisk断电关闭"); 
    }

}
