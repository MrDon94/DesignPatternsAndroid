package com.github.designpatternsandroid.pattern.structure.adapter;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 适配器模式使用方法
 * @date: 2024/7/24 14:31
 */
public class Usage {
    public static void main(String[] args) {
        //使用方式1
        ITarget classAdaptor = new ClassAdaptor();
        classAdaptor.f1();
        classAdaptor.f2();
        classAdaptor.fc();

        //使用方式2
        Adaptee adaptee = new Adaptee();
        ITarget objectAdaptor = new ObjectAdaptor(adaptee);
        objectAdaptor.f1();
        objectAdaptor.f2();
        objectAdaptor.fc();
    }
}
