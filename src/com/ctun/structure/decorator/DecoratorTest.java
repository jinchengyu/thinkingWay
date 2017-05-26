package com.ctun.structure.decorator;

/**
 * MP3本只有播放音乐的功能，那把MP3集成在一个新的电路模块上，该模块除了播放歌曲可以闪光
 * @ClassName DecoratorTest
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author pcdalao
 * @Date 2017年5月25日 下午4:30:06
 * @version 1.0.0
 */
public class DecoratorTest {

    public static void main(String[] args) {
        IMp3 mp3 = new Mp3();
        IShining shining  = new Shining();
        
        IMp3 decorator = new Decorator(mp3, shining);
        decorator.sing();
        
    }
    
}
