package com.ctun.action.iterator;

/**
 * 顺序访问聚集中的对象，集合中常见，如果对集合类比较熟悉的话，
 * 理解本模式会十分轻松。这句话包含两层意思：一是需要遍历的对象，
 * 即聚集对象，二是迭代器对象，用于对聚集对象进行遍历访问
 * @ClassName IteratorTest
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月26日 上午10:22:47
 * @version 1.0.0
 */
public class IteratorTest {
    
    public static void main(String[] args) {
        Collection collection = new NewCollection();
        Interator interator = collection.interator();
        
        while (interator.hasNext()) {
            System.out.println(interator.next());
        }
    }

}
