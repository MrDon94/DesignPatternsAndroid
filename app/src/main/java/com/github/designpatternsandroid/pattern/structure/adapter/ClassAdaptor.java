package com.github.designpatternsandroid.pattern.structure.adapter;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 适配器模式实现方式一：类适配器(基于继承)
 * 适用场景：Adaptee 和 ITarget 接口定义大部分都相同，推荐使用类适配器，因为 ClassAdaptor 复用父类 Adaptee 的
 * 接口，比起对象适配器的实现方式，Adaptor 的代码量要少一些。
 * @date: 2024/7/24 9:56
 */
public class ClassAdaptor extends Adaptee implements ITarget{
    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        //...重新实现f2()...
    }

    // 这里fc()不需要实现，直接继承自Adaptee，这是跟对象适配器最大的不同点
}
