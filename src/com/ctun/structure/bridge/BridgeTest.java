package com.ctun.structure.bridge;

/**
 * 多功能螺丝刀，换到头就可以，使用者始终是拧这个把，这个把就是做了一个桥接，一个柄，多个刀头
 * @ClassName BridgeTest
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月25日 下午5:22:23
 * @version 1.0.0
 */
public class BridgeTest {

    public static void main(String[] args) {
        
        IronHandle ironHandle = new IronHandle();
        
        Screwdriver plumScrewDriver = new PlumScrewDriver(); 
        
        ironHandle.setScrewdriver(plumScrewDriver);
        
        ironHandle.screw();
        
    }
    
}
