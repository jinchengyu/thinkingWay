package com.ctun.structure.flyweight;

import java.util.Vector;

public class Flyweight {
    //篮子最多有篮球数量
    private int count = 10;
    //篮子
    private Vector<String> basket = new Vector<>();
    
    private String ballName = null;
    
    public Flyweight() {
        
        for(int i = 1; i <= count; i++){
            
            basket.add(Math.random()*100 + "");
            
        }
    }
    
    /**
     * 拿走一个篮球
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @return
     */
    public String getBall(){
        
        if(basket.size() > 0){
            
            ballName = basket.get(0);
            
            basket.remove(ballName);
            
            return ballName;
        }
        
        return null;
    }
    
    /**
     * 还回篮球，一种是把旧的放回去，另一种直接产生新的
     * @Description (TODO这里用一句话描述这个方法的作用)
     */
    public void returnBall(){
        
        if(basket.size() > count){
            
            return;
            
        }
        
        ballName = Math.random()*100 + "";
        
        basket.add(ballName);
        
    }
    
    public static void main(String[] args) {
        Flyweight flyweight = new Flyweight();
        System.out.println("getBall--->" + flyweight.getBall());
        System.out.println("size -->" + flyweight.getBasket().size());
        System.out.println("getBall--->" + flyweight.getBall());
        System.out.println("size -->" + flyweight.getBasket().size());
        System.out.println("getBall--->" + flyweight.getBall());
        System.out.println("size -->" + flyweight.getBasket().size());
        System.out.println("getBall--->" + flyweight.getBall());
        System.out.println("size -->" + flyweight.getBasket().size());
        flyweight.returnBall();
        System.out.println("size -->" + flyweight.getBasket().size());
        
    }

    
    public int getCount() {
        return count;
    }

    
    public void setCount(int count) {
        this.count = count;
    }

    
    public Vector<String> getBasket() {
        return basket;
    }

    
    public void setBasket(Vector<String> basket) {
        this.basket = basket;
    }

    
    public String getBallName() {
        return ballName;
    }

    
    public void setBallName(String ballName) {
        this.ballName = ballName;
    }

}
