package com.github.designpatternsandroid.pattern.create.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 单例模式2.懒汉式
 * 懒汉式相对于饿汉式的优势是支持延迟加载。这种实现方式会导致频繁加锁、释放锁，以及并发度低等问题，频繁的调用会产生性能瓶颈。
 * @date: 2024/7/18 15:36
 */
public class IdGenerator2 {
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator2 instance;
    private IdGenerator2() {}
    public static synchronized IdGenerator2 getInstance() {
        if (instance == null) {
            instance = new IdGenerator2();
        }
        return instance;
    }
    public long getId() {
        return id.incrementAndGet();
    }
}
