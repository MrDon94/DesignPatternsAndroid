package com.github.designpatternsandroid.pattern.behavior.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 策略工厂
 * @date: 2024/7/30 14:59
 */
public class StrategyFactory {
    private static final Map<String, Strategy> strategies = new HashMap<>();

    static {
        strategies.put("A", new ConcreteStrategyA());
        strategies.put("B", new ConcreteStrategyB());
    }

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return strategies.get(type);
    }
}
