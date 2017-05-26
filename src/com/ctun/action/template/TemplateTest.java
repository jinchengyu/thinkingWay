package com.ctun.action.template;

/**
 * 要写一个论文，得先找到模板，模板有的具备了所有的单元，但是有的单元不确切，那就照着模板写份新的模板即可，且补充那个不明确就够了
 * @ClassName TemplateTest
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月26日 上午10:02:46
 * @version 1.0.0
 */
public class TemplateTest {
    
    public static void main(String[] args) {
        PaperTemplate paper = new Paper();
        paper.writePaper();  
    }

}
