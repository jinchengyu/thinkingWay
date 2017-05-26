package com.ctun.action.mediator;

/**
 * 找个私人侦探公司（中介）去跟踪某人，侦探公司得先招线人，找好后让线人去拍照，拍完了给线人酬劳
 * @ClassName MediatorTest
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月26日 下午2:18:39
 * @version 1.0.0
 */
public class MediatorTest {
    
    public static void main(String[] args) {
        
        IDetectiveCompany detectiveCompany = new DetectiveCompany();
        //找狗仔
        detectiveCompany.findPaparazzi();
        //拍照
        detectiveCompany.takePhoto();
        
    }

}
