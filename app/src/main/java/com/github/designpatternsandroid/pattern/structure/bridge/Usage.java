package com.github.designpatternsandroid.pattern.structure.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 桥接模式使用方法
 * 桥接模式:“抽象”和“实现”独立开发，通过对象之间的组合关系，组装在一起。Notification 类相当于抽象，MsgSender 类相当
 * 于实现，两者可以独立开发，通过组合关系（也就是桥梁）任意组合在一起
 * @date: 2024/7/23 11:51
 */
public class Usage {
    public static void main(String[] args) {
        AlertRule rule = new AlertRule();
        List<String> emails = new ArrayList<>();
        emails.add("xxx@qq.com");
        emails.add("yyy@163.com");
        EmailMsgSender msgSender = new EmailMsgSender(emails);
        SevereNotification severeNotification = new SevereNotification(msgSender);
        AlertHandler handler = new ErrorAlertHandler(rule, severeNotification);
        handler.check(new ApiStatInfo());
    }

}
