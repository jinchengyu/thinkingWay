package com.ctun.structure.proxy;

/**
 * 买一个产品不需要找到厂家，只需找到代理厂商就可以买到要的产品，实际厂家发货
 * @ClassName ProxyTest
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月25日 下午4:46:10
 * @version 1.0.0
 */
public class ProxyTest {
    
    public static void main(String[] args) {
        
       ISeller seller = new Proxy();
       
       seller.sell();
        
    }

}
