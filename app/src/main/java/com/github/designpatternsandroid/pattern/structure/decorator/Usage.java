package com.github.designpatternsandroid.pattern.structure.decorator;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 装饰器模式用法
 *
 * @date: 2024/7/23 15:01
 */
public class Usage {
    public static void main(String[] args) {
        //使用方式1
        A a = new A();
        ADecorator aDecorator = new ADecorator(a);
        aDecorator.f();

        //使用方式2(演示JDK源码中涉及到的案例)
        try {
            InputStream in = new FileInputStream("/test.txt");
            InputStream bin = new BufferedInputStream(in);
            DataInputStream din = new DataInputStream(bin);
            int data = din.readInt();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
