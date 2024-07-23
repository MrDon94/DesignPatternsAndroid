package com.github.designpatternsandroid.pattern.structure.bridge;

import java.util.List;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description:
 * @date: 2024/7/23 11:44
 */
public class EmailMsgSender implements MsgSender{
    private List<String> emails;

    public EmailMsgSender(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public void send(String message) {

    }
}
