package com.github.designpatternsandroid.pattern.create.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 单例模式1.饿汉式
 * 饿汉式的实现方式，在类加载的期间，就已经将 instance 静态实例初始化好了，所以，instance 实例的创建是线程安全的。不过，这样的实现方式不支持延迟加载实例。
 * @date: 2024/7/18 15:34
 */
public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static final IdGenerator instance = new IdGenerator();
    private IdGenerator() {}
    public static IdGenerator getInstance() {
        return instance;
    }
    public long getId() {
        return id.incrementAndGet();
    }
}
