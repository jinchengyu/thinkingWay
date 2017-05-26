package com.ctun.create.builder;

import com.ctun.create.builder.Computer;

public class BuilderTest {
    
    public static void main(String[] args) {
        
        Computer computer =new Computer.Builder().cpu("i7").memory("1024").hardDisk("1T").build();
        System.out.println(computer.toString());
        
    }

}
