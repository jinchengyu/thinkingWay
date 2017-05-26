package com.ctun.action.command;

/**
 * 遥控器
 * @ClassName Controller
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月26日 上午11:00:09
 * @version 1.0.0
 */
public class Controller {
    
    private Command addVolumnCommand;
    
    private Command changerChannelCommand;
    
    private Command minusVolumnCommand;

    
    public Command getAddVolumnCommand() {
        return addVolumnCommand;
    }

    
    public void setAddVolumnCommand(Command addVolumnCommand) {
        this.addVolumnCommand = addVolumnCommand;
    }

    
    public Command getChangerChannelCommand() {
        return changerChannelCommand;
    }

    
    public void setChangerChannelCommand(Command changerChannelCommand) {
        this.changerChannelCommand = changerChannelCommand;
    }

    
    public Command getMinusVolumnCommand() {
        return minusVolumnCommand;
    }

    
    public void setMinusVolumnCommand(Command minusVolumnCommand) {
        this.minusVolumnCommand = minusVolumnCommand;
    }
    
    public void changerChannelCommand(){
        changerChannelCommand.command();
    }
    
    public void minusVolumn(){
        minusVolumnCommand.command();
    }
    
    public void addVolumnCommand(){
        addVolumnCommand.command();
    }

}
