package com.ctun.action.filter;

import java.util.ArrayList;
import java.util.List;

public class ChainFilter implements Filter {
    
private List<Filter> filters = new ArrayList<>();
    
    public ChainFilter addFilter(Filter filter){
        
        filters.add(filter);
        
        return this;
        
    }

    @Override
    public String doFilter(String value) {
        
        for(Filter filter : filters){
            value = filter.doFilter(value);
        }
        
        return value;

    }

}
