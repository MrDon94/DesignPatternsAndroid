package com.github.designpatternsandroid.pattern.behavior.observer;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 观察者模式用法
 * 观察者模式：在对象之间定义一个一对多的依赖，当一个对象状态改变的时候，所有依赖的对象都会自动收到通知。
 * 一般情况下，被依赖的对象叫作被观察者（Observable），依赖的对象叫作观察者（Observer）。
 * 观察者模式是一个比较抽象的模式，根据不同的应用场景和需求，这个模式也有截然不同的实现方式:
 *      1.有同步阻塞的实现方式：基于同一个线程
 *      2.有异步非阻塞的实现方式：基于不同线程
 *      3.有跨进程的实现方式：基于消息队列
 * @date: 2024/7/26 15:34
 */
public class Usage {
    public static void main(String[] args) {
        //使用方式1:同步阻塞
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());
        subject.notifyObservers(new Message());//这里会依次调用所有观察者函数执行完毕才会执行下面的代码

        //使用方式2:异步非阻塞
        ConcreteSubject subject2 = new ConcreteSubject();
        subject2.registerObserver(new ConcreteObserverOne());
        subject2.registerObserver(new ConcreteObserverTwo());
        new Thread(new Runnable() {
            @Override
            public void run() {
                subject2.notifyObservers(new Message());
            }
        }).start();//这里不会阻塞下面的代码


        System.out.println("执行完成");
    }
}
