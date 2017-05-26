package com.ctun.action.command;


public class AddVolumnCommand implements Command {
    
    public AddVolumnCommand(Television tv) {
        super();
        this.tv = tv;
    }

    private Television tv;

    @Override
    public void command() {
       
        tv.changeChannel();
        
    }

}
