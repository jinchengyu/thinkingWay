package com.ctun.structure.facade;

/**
 * 开启电脑，点击开启，实际通电了CPU、内存、硬盘，这些使我们所看不到的
 * @ClassName FacadeTest
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月25日 下午4:56:15
 * @version 1.0.0
 */
public class FacadeTest {

    public static void main(String[] args) {
        IMechine computer  = new Computer();
        computer.start();
        computer.stop();
    }
    
}
