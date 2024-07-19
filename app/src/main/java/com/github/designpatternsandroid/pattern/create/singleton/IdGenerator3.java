package com.github.designpatternsandroid.pattern.create.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 单例模式3.双重检测
 * 双重检测实现方式既支持延迟加载、又支持高并发的单例实现方式。只要 instance 被创建之后，再调用 getInstance() 函
 * 数都不会进入到加锁逻辑中。所以，这种实现方式解决了懒汉式并发度低的问题。
 * @date: 2024/7/18 15:38
 */
public class IdGenerator3 {
    private AtomicLong id = new AtomicLong(0);
    /**
     * 给 instance 成员变量添加 volatile 关键字来禁止指令重排序
     * 原因：CPU 指令重排序可能导致在 IdGenerator 类的对象被关键字 new 创建并赋值给 instance 之后，还
     * 没来得及初始化（执行构造函数中的代码逻辑），就被另一个线程使用了。这样，另一个线程就使用了一个没有完整
     * 初始化的 IdGenerator 类的对象。
     */
    private static volatile IdGenerator3 instance;
    private IdGenerator3() {}
    public static IdGenerator3 getInstance() {
        if (instance == null) {
            synchronized(IdGenerator3.class) { // 此处为类级别的锁
                if (instance == null) {
                    instance = new IdGenerator3();
                }
            }
        }
        return instance;
    }
    public long getId() {
        return id.incrementAndGet();
    }
}
