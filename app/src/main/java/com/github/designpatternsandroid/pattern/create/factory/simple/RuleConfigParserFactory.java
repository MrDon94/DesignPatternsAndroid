package com.github.designpatternsandroid.pattern.create.factory.simple;

import com.github.designpatternsandroid.pattern.create.factory.IRuleConfigParser;
import com.github.designpatternsandroid.pattern.create.factory.JsonRuleConfigParser;
import com.github.designpatternsandroid.pattern.create.factory.PropertiesRuleConfigParser;
import com.github.designpatternsandroid.pattern.create.factory.XmlRuleConfigParser;
import com.github.designpatternsandroid.pattern.create.factory.YamlRuleConfigParser;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 简单工厂模式的第一种实现方法
 * @date: 2024/7/19 15:44
 */
public class RuleConfigParserFactory {
    public static IRuleConfigParser createParser(String configFormat) {
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(configFormat)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(configFormat)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(configFormat)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(configFormat)) {
            parser = new PropertiesRuleConfigParser();
        }
        return parser;
    }
}
