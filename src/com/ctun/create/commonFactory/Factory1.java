package com.ctun.create.commonFactory;

/**
 * 
 * @ClassName Factory1
 * @Description TODO(简单工厂)
 * @author pcdalao
 * @Date 2017年5月25日 上午10:42:39
 * @version 1.0.0
 */
public class Factory1 {
    
    /**
     * @Description (获得)
     * @param type
     * @return
     */
    public Sender produce(String type){
       
        if ("email".equals(type)) {  
            return new EmailSender();  
        } else if ("fax".equals(type)) {  
            return new FaxSender();  
        } else {  
            System.out.println("请输入正确的类型!");  
            return null;  
        }  
        
    }

}
