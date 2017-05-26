package com.ctun.structure.adapter;

/**
 * 手机充电器，交流电是220V，而充电器是输出220V电压，因此需要适配器转换，适配器将220转换成5V
 */
public class AdapterTest {
    public static void main(String[] args){
        test();
    }

    public static void test(){

        VoltAdapter voltAdapter = new VoltAdapter();
        System.out.println(voltAdapter.getVolt5());

    }

}
