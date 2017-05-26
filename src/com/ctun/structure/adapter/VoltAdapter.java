package com.ctun.structure.adapter;

/**
 * 适配器，即有5V的，又有220V的，就像转换头一样，两边都可以兼容
 */
public class VoltAdapter extends Volt220 implements FiveVolt {
    @Override
    public int getVolt5() {
        int volt = getVolt220();
        System.out.println("得到220V交流电");
        volt = 220/44;
        System.out.println("转换后得到电压：" + volt);
        return volt;
    }
}
