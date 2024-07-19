package com.github.designpatternsandroid.pattern.create.factory.simple;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description:
 * @date: 2024/7/19 15:47
 */
public class InvalidRuleConfigException extends Exception{
    public InvalidRuleConfigException() {
    }

    public InvalidRuleConfigException(String message) {
        super(message);
    }
}
