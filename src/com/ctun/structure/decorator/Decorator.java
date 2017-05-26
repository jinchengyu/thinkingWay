package com.ctun.structure.decorator;


public class Decorator implements IMp3{
    
    private IMp3 mp3 ;
    
    private IShining shining;

    public Decorator(IMp3 mp3, IShining shining) {
        super();
        this.mp3 = mp3;
        this.shining = shining;
    }


    @Override
    public void sing() {
        shining.shining();
        mp3.sing();
        shining.shining();
        
    }

    
    public IMp3 getMp3() {
        return mp3;
    }

    
    public void setMp3(IMp3 mp3) {
        this.mp3 = mp3;
    }

    
    public IShining getShining() {
        return shining;
    }

    
    public void setShining(IShining shining) {
        this.shining = shining;
    }
    
    

}
