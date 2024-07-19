package com.github.designpatternsandroid.pattern.create.factory.abstracted;

import com.github.designpatternsandroid.pattern.create.factory.IRuleConfigParser;
import com.github.designpatternsandroid.pattern.create.factory.ISystemConfigParser;
import com.github.designpatternsandroid.pattern.create.factory.XmlRuleConfigParser;
import com.github.designpatternsandroid.pattern.create.factory.XmlSystemConfigParser;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 抽象工厂:让一个工厂负责创建多个不同类型的对象（IRuleConfigParser、ISystemConfigParser 等），而不是只创建一种 parser 对象。这样就可以有效地减少工厂类的个数
 * @date: 2024/7/19 16:31
 */
public class XmlConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleParser() {
        return new XmlRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new XmlSystemConfigParser();
    }
}
