package com.github.designpatternsandroid.pattern.behavior.strategy;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 策略模式的使用
 * 策略模式：定义一族算法类，将每个算法分别封装起来，让它们可以互相替换。策略模式可以使算法的变化独立于使用它们的客户端（这里的客户端代指使用算法的代码）。
 * 策略模式、工厂模式、观察者模式的区别：
 *      工厂模式是解耦对象的创建和使用；
 *      观察者模式是解耦观察者和被观察者；
 *      策略模式是解耦策略的定义、创建、使用这三部分。
 * @date: 2024/7/30 15:00
 */
public class Usage {
    public static void main(String[] args) {
        //使用方式1：运行时动态确定，根据配置文件的配置决定使用哪种策略
        Strategy strategy = null;
        strategy = StrategyFactory.getStrategy("A");
        UserCache userCache = new UserCache(strategy);
        //...

        //使用方式2：非运行时动态确定，在代码中指定使用哪种策略
        ConcreteStrategyA concreteStrategyA = new ConcreteStrategyA();
        UserCache userCache1 = new UserCache(concreteStrategyA);
        //...
    }
}
