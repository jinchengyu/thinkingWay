package com.ctun.create.prototype;


public class Phone implements Cloneable{
    


    private int length;
    
    private int width;
    
    private int weight;

    public Phone(int length, int width, int weight) {
        super();
        this.length = length;
        this.width = width;
        this.weight = weight;
    }
    
    public int getLength() {
        return length;
    }

    
    public void setLength(int length) {
        this.length = length;
    }

    
    public int getWidth() {
        return width;
    }

    
    public void setWidth(int width) {
        this.width = width;
    }

    
    public int getWeight() {
        return weight;
    }

    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public Phone clone() throws CloneNotSupportedException{
        return (Phone) super.clone();
    }

}
