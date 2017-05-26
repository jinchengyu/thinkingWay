package com.ctun.action.command;

/**
 * 电视
 * @ClassName Television
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月26日 上午11:00:28
 * @version 1.0.0
 */
public class Television {
    
    public Television addVolumn(){
        
        System.out.println("加音量");
        
        return this;
        
    }
    
    public Television changeChannel(){
        
        System.out.println("换台");
        
        return this;
        
    }
    
    public Television mimusVolumn(){
        
        System.out.println("减音量");
        
        return this;
        
    }

}
