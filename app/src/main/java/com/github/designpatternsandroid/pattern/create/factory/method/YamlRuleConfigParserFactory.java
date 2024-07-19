package com.github.designpatternsandroid.pattern.create.factory.method;

import com.github.designpatternsandroid.pattern.create.factory.IRuleConfigParser;
import com.github.designpatternsandroid.pattern.create.factory.YamlRuleConfigParser;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description:
 * @date: 2024/7/19 16:03
 */
public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory{
    @Override
    public IRuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }
}
