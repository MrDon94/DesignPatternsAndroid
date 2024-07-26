package com.github.designpatternsandroid.pattern.behavior.observer;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 被观察者接口
 * @date: 2024/7/26 15:32
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Message message);
}
