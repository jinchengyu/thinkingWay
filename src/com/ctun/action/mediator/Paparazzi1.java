package com.ctun.action.mediator;

/**
 * 第1个狗仔队
 * @ClassName Paparazzi2
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月26日 下午2:14:35
 * @version 1.0.0
 */
public class Paparazzi1 extends IPaparazzi {

    public Paparazzi1(IDetectiveCompany detectiveCompany) {
        super(detectiveCompany);
       
    }

    @Override
    public void takePhoto() {
        
        System.out.println("完成拍照2");
        
        System.out.println("狗仔1收到工钱： " + this.getDetectiveCompany().payMoney());;

    }

}
