package com.github.designpatternsandroid.pattern.create.factory.abstracted;

import com.github.designpatternsandroid.pattern.create.factory.IRuleConfigParser;
import com.github.designpatternsandroid.pattern.create.factory.ISystemConfigParser;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description:
 * @date: 2024/7/19 16:22
 */
public interface IConfigParserFactory {
    IRuleConfigParser createRuleParser();
    ISystemConfigParser createSystemParser();
}
