package com.github.designpatternsandroid.pattern.behavior.template;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description:模板模式使用方法
 * @date: 2024/7/29 15:38
 */
public class Usage {
    public static void main(String[] args) {
        //使用方式1
        AbstractClass demo = new ConcreteClass1();
        demo.templateMethod();
    }
}
