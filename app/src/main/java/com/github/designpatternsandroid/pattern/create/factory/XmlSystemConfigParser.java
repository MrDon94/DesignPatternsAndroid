package com.github.designpatternsandroid.pattern.create.factory;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description:
 * @date: 2024/7/19 16:33
 */
public class XmlSystemConfigParser implements ISystemConfigParser{
    @Override
    public SystemConfig parse(String configText) {
        SystemConfig systemConfig = new SystemConfig();
        //根据configText解析生成SystemConfig对象返回
        return systemConfig;
    }
}
