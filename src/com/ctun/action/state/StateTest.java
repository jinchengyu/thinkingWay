package com.ctun.action.state;

/**
 * 好比一个人，饿了就要吃，渴了就要喝，累了就要睡，不同的状态要做不同的事情
 * @ClassName StateTest
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月26日 下午1:24:30
 * @version 1.0.0
 */
public class StateTest {
    
    public static void main(String[] args) {
        
        State state = new State();
        
        state.setValue("hungry");
        
        Person person = new Person();
        
        person.setState(state);
        
        person.act();
        
    }

}
