package com.github.designpatternsandroid.pattern.behavior.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description:
 * @date: 2024/7/30 15:02
 */
public class UserCache {
    private Map<String, Object> cacheData = new HashMap<>();
    private Strategy mStrategy;

    public UserCache(Strategy strategy) {
        mStrategy = strategy;
    }

    //...
}
