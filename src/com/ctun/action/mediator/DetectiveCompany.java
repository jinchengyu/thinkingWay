package com.ctun.action.mediator;


public class DetectiveCompany implements IDetectiveCompany{
    
    private IPaparazzi paparazzi1;
    
    private IPaparazzi paparazzi2;
    
    /**
     * 找到狗仔队
     * @Description (TODO这里用一句话描述这个方法的作用)
     */
    @Override
    public void findPaparazzi(){
        paparazzi1 = new Paparazzi1(this);
        paparazzi2 = new Paparazzi2(this);
    }
    
    /**
     * 拍照片
     * @Description (TODO这里用一句话描述这个方法的作用)
     */
    @Override
    public void takePhoto(){
        
        paparazzi1.takePhoto();
        
        paparazzi2.takePhoto();
        
    }
    
    /**
     * 付工钱
     * @Description (TODO这里用一句话描述这个方法的作用)
     */
    @Override
    public int payMoney(){
        
        return 100;
    }

}
