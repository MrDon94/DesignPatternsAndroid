package com.github.designpatternsandroid.pattern.behavior.chain;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 处理器链：链表形式
 * @date: 2024/7/31 9:20
 */
public class HandlerChain {
    private Handler head = null;
    private Handler tail = null;

    public void addHandler(Handler handler) {
        handler.setSuccessor(null);

        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }

        tail.setSuccessor(handler);
        tail = handler;
    }

    public void handle() {
        if (head != null) {
            head.handle();
        }
    }
}
