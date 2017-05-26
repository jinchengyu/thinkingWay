package com.ctun.action.visitor;
public class MyVisitor implements Visitor {  
  
    @Override  
    public void visit(Subject sub) {
        
        System.out.println("我是感冒患者，我要找："+ sub.getSubject());  
        
    }  
}  