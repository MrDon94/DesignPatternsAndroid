package com.github.designpatternsandroid.pattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 被观察者实现类
 * @date: 2024/7/26 15:33
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

}
