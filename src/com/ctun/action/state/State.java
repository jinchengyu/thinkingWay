package com.ctun.action.state;


public class State implements IState{
    
    private String value;

    @Override
    public void eat() {
       
        System.out.println("我要吃饭");
        
    }

    @Override
    public void drink() {
       
        System.out.println("我要喝水");
        
    }

    @Override
    public void sleep() {
       
        System.out.println("我要睡觉");
        
    }

    
    public String getValue() {
        return value;
    }

    
    public void setValue(String value) {
        this.value = value;
    }

}
