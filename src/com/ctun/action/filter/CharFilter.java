package com.ctun.action.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 特殊字符过滤
 * @ClassName CharFilter
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月26日 上午10:29:16
 * @version 1.0.0
 */
public class CharFilter implements Filter {
    
    

    @Override
    public String doFilter(String value) {
       
        System.out.println("特殊字符过滤--->");
        return value + "特殊字符过滤--->";

    }

}
