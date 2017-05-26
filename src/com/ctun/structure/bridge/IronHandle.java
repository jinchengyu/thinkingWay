package com.ctun.structure.bridge;

/**
 * 螺丝刀柄
 * @ClassName IronHandle
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月25日 下午5:20:21
 * @version 1.0.0
 */
public class IronHandle {
    
    private Screwdriver screwdriver;
    
    
    public void screw() {
        
        getScrewdriver().screw();;
        
    }

    
    public Screwdriver getScrewdriver() {
        return screwdriver;
    }

    
    public void setScrewdriver(Screwdriver screwdriver) {
        System.out.println("套上刀头");
        this.screwdriver = screwdriver;
    }

}
