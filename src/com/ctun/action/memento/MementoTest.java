package com.ctun.action.memento;

import java.io.UnsupportedEncodingException;
/**
 * 数据库备份机制，服务器1数据库A执行命令生成二进制文件（Memento），
 * 再将二进制传输给服务器2目录下即可灾备，
 * 恢复数据时将服务器2的二进制数据导入数据库即可
 * @ClassName MementoTest
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月26日 上午11:46:05
 * @version 1.0.0
 */
public class MementoTest {
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        DataBase db = new DataBase();
        
        db.setData("插入一条新的数据AAAA");
        
        Binnary binnary = db.createBinary();
        
        LinuxServer server = new LinuxServer();
        
        server.setBinnary(binnary);
        
        System.out.println("1.此时的数据---》" + db.getData());
        
        db.setData("插入一条新的数据BBBB");
        
        System.out.println("2.此时的数据---》" + db.getData());
        
        db.restoreData(server.getBinnary());
        
        System.out.println("3.此时的数据---》" + db.getData());
    }
    

}
