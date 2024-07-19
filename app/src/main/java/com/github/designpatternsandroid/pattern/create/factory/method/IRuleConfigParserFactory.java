package com.github.designpatternsandroid.pattern.create.factory.method;

import com.github.designpatternsandroid.pattern.create.factory.IRuleConfigParser;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description:
 * @date: 2024/7/19 16:00
 */
public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}
