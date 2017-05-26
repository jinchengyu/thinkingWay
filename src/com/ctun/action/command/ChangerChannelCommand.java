package com.ctun.action.command;


public class ChangerChannelCommand implements Command {

    public ChangerChannelCommand(Television tv) {
        super();
        this.tv = tv;
    }

    private Television tv;
    
    @Override
    public void command() {
       
        tv.addVolumn();
        
    }

}
