package com.github.designpatternsandroid

import android.app.Application

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 23种设计模式
 * 创建型设计模式主要解决“对象的创建”问题，结构型设计模式主要解决“类或对象的组合或组装”问题，那行为型设计模式主要解决的就是“类或对象之间的交互”问题。
 * 创建型：
 *      常用：
 *          单例模式
 *          工厂模式(工厂方法和抽象工厂)
 *          建造者模式
 *      不常用：
 *          原型模式
 * 结构型：
 *      常用：
 *          代理模式
 *          桥接模式
 *          装饰者模式
 *          适配器模式
 *      不常用：
 *          门面模式
 *          组合模式
 *          享元模式
 * 行为型：
 *      常用：
 *          观察者模式
 *          模板模式
 *          策略模式
 *          职责链模式
 *          迭代器模式
 *          状态模式
 *      不常用：
 *          访问者模式
 *          备忘录模式
 *          命令模式
 *          解释器模式
 *          中介模式
 * @date: 2024/7/18 15:24
 */
class App: Application() {
    override fun onCreate() {
        super.onCreate()
    }
}