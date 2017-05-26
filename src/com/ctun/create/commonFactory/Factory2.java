package com.ctun.create.commonFactory;

/**
 * 
 * @ClassName Factory2
 * @Description TODO(简单工厂get)
 * @author pcdalao
 * @Date 2017年5月25日 上午10:42:12
 * @version 1.0.0
 */
public class Factory2 {
    
   public Sender getEmailSender(){
       return new EmailSender();
   }
   
   public Sender getFaxSender(){
       return new FaxSender();
   }

}
