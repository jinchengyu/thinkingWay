package com.ctun.action.iterator;


public interface Collection {
    
    public Interator interator();
    
    /**
     * 获得集合元素
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @param i
     * @return
     */
    public Object get(int i);
    
    /**
     * 取得集合大小
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @return
     */
    public int size();

}
