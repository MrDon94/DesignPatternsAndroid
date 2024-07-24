package com.github.designpatternsandroid.pattern.structure.proxy;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 静态代理使用方法
 * @date: 2024/7/23 10:15
 */
public class Usage {
    public static void main(String[] args) {
        //使用方式1：静态代理实现接口方式
        //UserControllerProxy使用举例
        //因为原始类和代理类实现相同的接口，是基于接口而非实现编程
        //将UserController类对象替换为UserControllerProxy类对象，不需要改动太多代码
        IUserController userController = new UserControllerProxy(new UserController());

        //使用方式2：静态代理继承方式
        //UserControllerProxy2使用举例
        UserController userController2 = new UserControllerProxy2();


        //使用方式3：动态代理
        //MetricsCollectorProxy使用举例
        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        IUserController userController3 = (IUserController) proxy.createProxy(new UserController());
    }
}
