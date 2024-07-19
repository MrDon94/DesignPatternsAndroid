package com.github.designpatternsandroid.pattern.create.factory;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description:
 * @date: 2024/7/19 16:27
 */
public interface ISystemConfigParser {
    SystemConfig parse(String configText);
}
