package com.ctun.action.memento;

import java.io.UnsupportedEncodingException;

/**
 * 数据库
 * @ClassName DataBase
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月26日 上午11:27:49
 * @version 1.0.0
 */
public class DataBase {
    //数据
    private String data;
    
    public String getData() {
        return data;
    }

    
    public void setData(String data) {
        this.data = data;
    }
    
    /**
     * 创建备份
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @return
     */
    public Binnary createBinary(){
        
        Binnary binnary = new Binnary();
        
        binnary.setData(data.getBytes());
        
        return binnary;
        
    }
    
    public void restoreData(Binnary binnary) throws UnsupportedEncodingException{
        
        data = new String(binnary.getData(), "UTF-8");
        
    }
  

    
}
