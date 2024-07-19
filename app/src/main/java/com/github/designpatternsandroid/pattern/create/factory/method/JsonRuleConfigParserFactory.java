package com.github.designpatternsandroid.pattern.create.factory.method;

import com.github.designpatternsandroid.pattern.create.factory.IRuleConfigParser;
import com.github.designpatternsandroid.pattern.create.factory.JsonRuleConfigParser;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description:
 * @date: 2024/7/19 16:01
 */
public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}
