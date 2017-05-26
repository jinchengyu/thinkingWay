package com.ctun.action.filter;

/**
 * 数字过滤
 * @ClassName NumFilter
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月26日 上午10:30:06
 * @version 1.0.0
 */
public class NumFilter implements Filter {

    @Override
    public String doFilter(String value) {
       
        System.out.println("数字过滤--->");
        return value + "数字过滤--->";

    }

}
