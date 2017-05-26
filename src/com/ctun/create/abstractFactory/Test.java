package com.ctun.create.abstractFactory;

import com.ctun.create.commonFactory.Sender;

public class Test {  
  
    public static void main(String[] args) {  
        Provider provider = new SendMailFactory();  
        Sender sender = provider.produce();  
        sender.send("再别康桥");  
    }  
}  