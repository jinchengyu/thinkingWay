package com.ctun.action.strategy;

/**
 * 假设每个计算器只能完成一种算法，加法是加法的，减法是减法，调用不同的计算器，做算法的操作，做类似的事情，却不同的细节
 * @ClassName StrategyTest
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月25日 下午6:32:35
 * @version 1.0.0
 */
public class StrategyTest {  
  
    public static void main(String[] args) {  
        String exp = "2+8";  
        ICalculator cal = new Plus();  
        int result = cal.calculate(exp);  
        System.out.println(result);  
    }  
}  