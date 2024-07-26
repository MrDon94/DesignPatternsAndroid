package com.github.designpatternsandroid.pattern.behavior.observer;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 观察者实现类
 * @date: 2024/7/26 15:34
 */
public class ConcreteObserverTwo implements Observer {
    @Override
    public void update(Message message) {
        //TODO: 获取消息通知，执行自己的逻辑...
        System.out.println("ConcreteObserverTwo is notified.");
    }
}
