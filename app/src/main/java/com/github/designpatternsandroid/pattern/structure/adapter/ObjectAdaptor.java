package com.github.designpatternsandroid.pattern.structure.adapter;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 适配器模式实现方式二：对象适配器(基于组合)
 * 适用场景：ObjectAdaptor 和 ITarget 接口定义大部分都不相同，那我们推荐使用对象适配器，因为组合结构相对于继承更加灵活。
 * @date: 2024/7/24 9:56
 */
public class ObjectAdaptor implements ITarget {
    private Adaptee adaptee;

    public ObjectAdaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        adaptee.fa();//委托给Adaptee
    }

    @Override
    public void f2() {
        //...重新实现f2()...
    }

    @Override
    public void fc() {
        adaptee.fc();
    }
}
