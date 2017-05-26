package com.ctun.structure.bridge;

/**
 * 一字螺丝刀
 * @ClassName SlottedScrewdriver
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月25日 下午5:16:48
 * @version 1.0.0
 */
public class SlottedScrewdriver implements Screwdriver{

    @Override
    public void screw() {
       
        System.out.println("一字螺丝刀---拧---》");
        
    }
    
}
