package com.ctun.action.command;


/**
 * 遥控器（controller）与电视（receiver），
 * 遥控器只要点击按钮发出命令(command)就可以让电视换台、调节音量等
 * @ClassName CommandTest
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月26日 上午11:10:42
 * @version 1.0.0
 */
public class CommandTest {
    
    public static void main(String[] args) {
        
        Television tv = new Television();
        
        Command addVolumnCommand = new AddVolumnCommand(tv);
        
        Command changerChannelCommand = new ChangerChannelCommand(tv);
        
        Command minusVolumnCommand = new MinusVolumnCommand(tv);
        
        Controller controller = new Controller();
        
        controller.setAddVolumnCommand(addVolumnCommand);
        
        controller.setChangerChannelCommand(changerChannelCommand);
        
        controller.setMinusVolumnCommand(minusVolumnCommand);
        
        controller.addVolumnCommand();
        
        controller.changerChannelCommand();
        
        controller.minusVolumn();
    }

}
