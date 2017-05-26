package com.ctun.create.commonFactory;

/**
 * 
 * @ClassName Factory3
 * @Description TODO(静态工厂)
 * @author pcdalao
 * @Date 2017年5月25日 上午10:41:53
 * @version 1.0.0
 */
public class Factory3 {
    
   public static Sender getEmailSender(){
       return new EmailSender();
   }
   
   public static Sender getFaxSender(){
       return new FaxSender();
   }

}
