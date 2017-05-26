package com.ctun.create.abstractFactory;

import com.ctun.create.commonFactory.Sender;

/**
 * 
 * @ClassName Provider
 * @Description TODO(抽象工厂接口)
 * @author pcdalao
 * @Date 2017年5月25日 上午10:46:11
 * @version 1.0.0
 */
public interface Provider {  
    public Sender produce();  
}  