package com.github.designpatternsandroid.pattern.behavior.chain;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 职责链模式用法
 * 职责链模式：将请求的发送和接收解耦，让多个接收对象都有机会处理这个请求。将这些接收对象串成一条链，并沿着这条链传递这
 * 个请求，直到链上的某个接收对象能够处理它为止。
 * 另一种描述：在职责链模式中，多个处理器（也就是刚刚定义中说的“接收对象”）依次处理同一个请求。一个请求先经过 A 处理器
 * 处理，然后再把请求传递给 B 处理器，B 处理器处理完后再传递给 C 处理器，以此类推，形成一个链条。链条上的每个处理器各
 * 自承担各自的处理职责，所以叫作职责链模式。
 * @date: 2024/7/31 9:20
 */
public class Usage {
    public static void main(String[] args) {
        //使用方式1：链表形式
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();

        //使用方式2：数组形式
        HandlerChain2 chain2 = new HandlerChain2();
        chain2.addHandler(new HandlerOne());
        chain2.addHandler(new HandlerTwo());
        chain2.handle();

        //职责链模式还有一种变体，那就是请求会被所有的处理器都处理一遍，不存在中途终止的情况。
        //这种变体也有两种实现方式：用链表存储处理器和用数组存储处理器，跟上面的两种实现方式类似，只需要稍微修改即可。
        //使用方式3：链表形式
        //使用方式4：数组形式
    }
}
