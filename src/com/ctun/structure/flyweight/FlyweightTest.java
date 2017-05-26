package com.ctun.structure.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class FlyweightTest {

    public static void main(String[] args) {
        
        test();
       
    }
    
    public static void test(){
        
//        String value = null;
//        
//        List<String> pool = new ArrayList<>();
//        
//        for(int i = 1; i < 10; i++){
//            value = Math.random()*100 + "";
//            pool.add(value);
//        }
//        
//        for(String val : pool){
//            System.out.println("-->" + val);
//        }
//        System.out.println("++++++++>>>>>" + value);
        
        HashMap<String, String> map = null;
        
        String value = null;
        
        List< HashMap<String, String>> pool = new ArrayList<>();
        
        for (int i = 1; i < 10; i++) {
            value = Math.random() * 100 + "";
            HashMap<String, String> temMap = new HashMap<String, String>();
            temMap.put("key", value);
            map = temMap;
            pool.add(map);
        }
        
        for(Map<String, String> temMap : pool){
            System.out.println("--->" + temMap.get("key"));
        }
        
    }
    
}
