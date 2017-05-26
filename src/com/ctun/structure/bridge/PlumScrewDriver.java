package com.ctun.structure.bridge;

import javax.swing.plaf.synth.SynthSpinnerUI;

/**
 * 梅花螺丝刀
 * @ClassName PlumScrewDriver
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月25日 下午5:16:30
 * @version 1.0.0
 */
public class PlumScrewDriver implements Screwdriver{

    @Override
    public void screw() {
       
        System.out.println("梅花螺丝刀---拧---》");
        
    }

}
