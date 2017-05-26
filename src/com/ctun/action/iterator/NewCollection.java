package com.ctun.action.iterator;


public class NewCollection implements Collection {

    public String string[] = {"A", "B", "C", "D", "E"};
    
    @Override
    public Interator interator() {
        
        return new NewInterator(this);
    }

    @Override
    public Object get(int i) {
        // TODO Auto-generated method stub
        return string[i];
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return string.length;
    }

}
