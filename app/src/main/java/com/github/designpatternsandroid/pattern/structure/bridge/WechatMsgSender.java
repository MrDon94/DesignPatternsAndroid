package com.github.designpatternsandroid.pattern.structure.bridge;

import java.util.List;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description:
 * @date: 2024/7/23 11:44
 */
public class WechatMsgSender implements MsgSender{
    private List<String> wechats;

    public WechatMsgSender(List<String> wechats) {
        this.wechats = wechats;
    }

    @Override
    public void send(String message) {

    }
}
