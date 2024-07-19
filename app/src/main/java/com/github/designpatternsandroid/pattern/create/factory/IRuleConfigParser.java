package com.github.designpatternsandroid.pattern.create.factory;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description:
 * @date: 2024/7/19 15:41
 */
public interface IRuleConfigParser {
    RuleConfig parse(String configText);
}
