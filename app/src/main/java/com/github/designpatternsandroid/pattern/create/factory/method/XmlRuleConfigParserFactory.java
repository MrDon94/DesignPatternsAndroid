package com.github.designpatternsandroid.pattern.create.factory.method;

import com.github.designpatternsandroid.pattern.create.factory.IRuleConfigParser;
import com.github.designpatternsandroid.pattern.create.factory.XmlRuleConfigParser;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description:
 * @date: 2024/7/19 16:02
 */
public class XmlRuleConfigParserFactory implements IRuleConfigParserFactory{
    @Override
    public IRuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }
}
