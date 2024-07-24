package com.github.designpatternsandroid.pattern.structure.decorator;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 装饰器模式
 * 适用场景：给原始类添加增强功能
 * 和代理模式的区别：代理模式中，代理类附加的是跟原始类无关的功能，而在装饰器模式中，装饰器类附加的是跟原始类相关的增强功能。
 * 两个特殊点：1.装饰器类和原始类继承同样的父类，这样我们可以对原始类“嵌套”多个装饰器类。
 *           2.装饰器类是对功能的增强，这也是装饰器模式应用场景的一个重要特点。
 * @date: 2024/7/23 15:21
 */
public class ADecorator implements IA{
    private IA a;

    public ADecorator(IA a) {
        this.a = a;
    }

    @Override
    public void f() {
        //功能增强代码
        a.f();
        //功能增强代码
    }
}
