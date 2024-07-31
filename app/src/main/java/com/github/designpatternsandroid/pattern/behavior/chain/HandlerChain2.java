package com.github.designpatternsandroid.pattern.behavior.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 处理器链：数组形式
 * @date: 2024/7/31 9:25
 */
public class HandlerChain2 {
    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            //这里如果移除handled判断和返回类型就是另外一种变体形式
            if (handled){
                break;
            }
        }
    }
}
