package com.ctun.action.command;


public class MinusVolumnCommand implements Command {

    public MinusVolumnCommand(Television tv) {
        super();
        this.tv = tv;
    }

    private Television tv;
    
    @Override
    public void command() {
       
        tv.mimusVolumn();
        
    }

}
