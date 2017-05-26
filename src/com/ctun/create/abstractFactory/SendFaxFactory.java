package com.ctun.create.abstractFactory;

import com.ctun.create.commonFactory.EmailSender;
import com.ctun.create.commonFactory.FaxSender;
import com.ctun.create.commonFactory.Sender;

public class SendFaxFactory implements Provider {  
      
    @Override  
    public Sender produce(){  
        
        return new FaxSender();  
        
    }  
} 