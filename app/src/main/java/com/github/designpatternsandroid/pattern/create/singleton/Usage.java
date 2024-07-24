package com.github.designpatternsandroid.pattern.create.singleton;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 单例模式使用方法
 * @date: 2024/7/24 10:48
 */
public class Usage {
    public static void main(String[] args) {
        //使用方式1：饿汉式
        long id1 = IdGenerator.getInstance().getId();

        //使用方式2：懒汉式
        long id2 = IdGenerator2.getInstance().getId();

        //使用方式3：双重检测
        long id3 = IdGenerator3.getInstance().getId();

        //使用方式4：静态内部类
        long id4 = IdGenerator4.getInstance().getId();

        //使用方式5：枚举
        long id5 = IdGenerator5.INSTANCE.getId();
    }
}
