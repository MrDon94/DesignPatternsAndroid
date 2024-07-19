package com.github.designpatternsandroid.pattern.create.factory.simple;

import com.github.designpatternsandroid.pattern.create.factory.IRuleConfigParser;
import com.github.designpatternsandroid.pattern.create.factory.JsonRuleConfigParser;
import com.github.designpatternsandroid.pattern.create.factory.PropertiesRuleConfigParser;
import com.github.designpatternsandroid.pattern.create.factory.XmlRuleConfigParser;
import com.github.designpatternsandroid.pattern.create.factory.YamlRuleConfigParser;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 简单工厂模式第二种实现方法，有点类似单例模式和简单工厂模式的结合
 * @date: 2024/7/19 15:52
 */
public class RuleConfigParserFactory2 {
    private static final Map<String, IRuleConfigParser> cachedParsers = new HashMap<>();

    static {
        cachedParsers.put("json", new JsonRuleConfigParser());
        cachedParsers.put("xml", new XmlRuleConfigParser());
        cachedParsers.put("yaml", new YamlRuleConfigParser());
        cachedParsers.put("properties", new PropertiesRuleConfigParser());
    }

    public static IRuleConfigParser createParser(String configFormat) {
        if (configFormat == null || configFormat.isEmpty()) {
            return null;//返回null还是IllegalArgumentException全凭你自己说了算
        }
        IRuleConfigParser parser = cachedParsers.get(configFormat.toLowerCase());
        return parser;
    }
}
