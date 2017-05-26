package com.ctun.action.template;

/**
 * 论文模板
 * @ClassName PaperTemplate
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月26日 上午9:58:30
 * @version 1.0.0
 */
public abstract class PaperTemplate {
    
    public void abstractContent(){
        System.out.println("写上论文开题摘要");
    }
    
    public abstract void centreContent();
    
    public void summary(){
        System.out.println("写上论文总结");
    }
    

    public void writePaper(){
        abstractContent();
        centreContent();
        summary();
    }

}
