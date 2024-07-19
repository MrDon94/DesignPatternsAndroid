package com.github.designpatternsandroid.pattern.create.factory;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description:
 * @date: 2024/7/19 15:42
 */
public class JsonRuleConfigParser implements IRuleConfigParser {
    @Override
    public RuleConfig parse(String configText) {
        RuleConfig ruleConfig = new RuleConfig();
        //根据configText解析生成RuleConfig对象返回
        return ruleConfig;
    }
}
