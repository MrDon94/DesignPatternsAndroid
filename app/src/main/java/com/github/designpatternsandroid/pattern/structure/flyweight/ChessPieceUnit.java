package com.github.designpatternsandroid.pattern.structure.flyweight;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 享元类
 * 享元模式：享元模式的意图是复用对象，节省内存，前提是享元对象是不可变对象。
 * 享元模式和单例、缓存、对象池区别：
 *      应用单例模式是为了保证对象全局唯一。
 *      应用享元模式是为了实现对象复用，节省内存。
 *      缓存是为了提高访问效率，而非复用。
 *      池化技术中的“复用”理解为“重复使用”，主要是为了节省时间。
 * @date: 2024/7/25 17:40
 */
public class ChessPieceUnit {
    private int id;
    private String text;
    private Color color;

    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }

    public static enum Color {
        RED, BLACK
    }

    // ...省略其他属性和getter方法...
}






