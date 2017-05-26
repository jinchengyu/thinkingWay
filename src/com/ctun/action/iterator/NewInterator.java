package com.ctun.action.iterator;


public class NewInterator implements Interator {

    private Collection collection;
    
    private int pos = -1;
    
    public NewInterator(Collection collection) {
        super();
        this.collection = collection;
    }

    @Override
    public Object previous() {
        if(pos > 0){
            pos--;
        }
        return collection.get(pos);
    }

    @Override
    public Object next() {
        if(pos < collection.size()-1){
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if(pos < collection.size()-1){
            return true;
        }
        return false;
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.get(pos);
    }

}
