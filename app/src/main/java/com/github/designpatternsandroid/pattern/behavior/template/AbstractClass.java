package com.github.designpatternsandroid.pattern.behavior.template;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 模板模式:模板方法模式在一个方法中定义一个算法骨架，并将某些步骤推迟到子类中实现。模板方法模式可以让子类在不改变算法整体结构的情况下，重新定义算法中的某些步骤。
 * 实现方式1(经典)：模板方法定义为 final，可以避免被子类重写。需要子类重写的方法定义为 abstract，可以强迫子类去实现。
 * 在实际项目开发中，模板模式的实现比较灵活，以上两点都不是必须的。
 * 实现方式2(Java AbstractList)：不声明abstract方法，但函数实现直接抛出UnsupportedOperationException异常。这样子类不重写就不能使用。
 * 实现方式3(JUnit TestCase)：不声明abstract方法，提供默认的实现，不强制子类去重新实现，但这部分也是可以在子类中定制的，也符合模板模式的定义。
 * @date: 2024/7/29 15:38
 */
public abstract class AbstractClass {
    public final void templateMethod() {
        //...
        method1();
        //...
        method2();
        //...
    }

    protected abstract void method1();
    protected abstract void method2();
}
