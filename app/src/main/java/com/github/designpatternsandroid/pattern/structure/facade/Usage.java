package com.github.designpatternsandroid.pattern.structure.facade;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 门面模式用法
 * @date: 2024/7/25 11:20
 */
public class Usage {
    public static void main(String[] args) {
        //使用方式1：客户端调用接口
        OrderFacade orderFacade = new OrderFacade();
        // 客户下订单
        orderFacade.placeOrder("iPhone", 1, "John Doe");
    }
}
