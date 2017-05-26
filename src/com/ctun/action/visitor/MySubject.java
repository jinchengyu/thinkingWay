package com.ctun.action.visitor;

public class MySubject implements Subject {

    @Override
    public void accept(Visitor visitor) {
        
        visitor.visit(this);
        
    }

    @Override
    public String getSubject() {
        
        return "内科医生";
        
    }
}
