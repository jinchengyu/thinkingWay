package com.ctun.action.iterator;


public interface Interator {
    
    /**
     * 前移
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @return
     */
    public Object previous();
    
    /**
     * 后移
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @return
     */
    public Object next();
    
    /**
     * 判定还有下个不
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @return
     */
    public boolean hasNext();
    
    /**
     * 取得第一个元素
     * @Description (TODO这里用一句话描述这个方法的作用)
     * @return
     */
    public Object first();

}
