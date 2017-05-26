package com.ctun.action.filter;


public class FilterTest {
    
    public static void main(String[] args) {
        
        Filter wordFilter = new WordFilter();
        
        Filter numFilter = new NumFilter();
        
        Filter charFilter = new CharFilter();
        
        ChainFilter chainFilter = new ChainFilter();
        
        chainFilter.addFilter(wordFilter).addFilter(charFilter).addFilter(numFilter);
        
        String value = "责任链模式测试";
        
        System.out.println(chainFilter.doFilter(value));
    }

}
