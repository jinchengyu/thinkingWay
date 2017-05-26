package com.ctun.action.state;


public class Person {

    private State state;
    
    public State getState() {
        return state;
    }

    
    public void setState(State state) {
        this.state = state;
    }
    
    public void act(){
        if(null != state.getValue()){
            if(state.getValue().equals("hungry")){
                state.eat();
            }else if(state.getValue().equals("thisty")){
                state.drink();
            }else if(state.getValue().equals("tired")){
                state.sleep();
            }
        }
        
    }

}
