package com.ctun.create.commonFactory;

/**
 * @ClassName Sender
 * @Description TODO(发送器)
 * @author pcdalao
 * @Date 2017年5月25日 上午10:22:50
 * @version 1.0.0
 */
public class FaxSender implements Sender{
	
    /**
     * 
     */
    @Override
	public void send(String content){
	    System.out.println("FaxSender:传真发送" + content);
	}

}
