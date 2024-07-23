package com.github.designpatternsandroid.pattern.structure.decorator;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 装饰器模式
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
