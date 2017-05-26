package com.ctun.create.builder;

/**
 * 
 * @ClassName Computer
 * @Description TODO(Computer 包含静态内部类Builder（静态方法供外界调用），且利用Builder实例，builder完成一切赋值)
 * @author pcdalao
 * @Date 2017年5月25日 上午11:17:46
 * @version 1.0.0
 */
public class Computer {
    
    private String cpu;
    
    private String memory;
    
    private String hardDisk;
    
    public  static class Builder{
        
        private String cpu;
        
        private String memory;
        
        private String hardDisk;
        
        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        
        public Builder memory(String memory){
            this.memory = memory;
            return this;
        }
        
        public Builder hardDisk(String hardDisk){
            this.hardDisk = hardDisk;
            return this;
        }
        
        public Computer build(){
            
            return new Computer(this);
            
        }
        
    }
    
    private Computer(Builder builder){
        
        this.cpu = builder.cpu;
        
        this.memory = builder.memory;
        
        this.hardDisk = builder.hardDisk;
    }

    @Override
    public String toString() {
        return "Computer [cpu=" + cpu + ", memory=" + memory + ", hardDisk=" + hardDisk + "]";
    }

}
