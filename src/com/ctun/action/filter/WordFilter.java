package com.ctun.action.filter;

/**
 * 敏感字过滤
 * @ClassName WordFilter
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月26日 上午10:29:52
 * @version 1.0.0
 */
public class WordFilter implements Filter {

    @Override
    public String doFilter(String value) {
       
        System.out.println("敏感字过滤--->");
        return value + "敏感字过滤--->";

    }

}
