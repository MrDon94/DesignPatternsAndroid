package com.github.designpatternsandroid.pattern.create.factory;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description:
 * @date: 2024/7/19 15:43
 */
public class YamlRuleConfigParser implements IRuleConfigParser {
    @Override
    public RuleConfig parse(String configText) {
        RuleConfig ruleConfig = new RuleConfig();
        //根据configText解析生成RuleConfig对象返回
        return ruleConfig;
    }
}
