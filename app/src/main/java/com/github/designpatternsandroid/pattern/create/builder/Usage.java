package com.github.designpatternsandroid.pattern.create.builder;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 建造者模式用法
 * @date: 2024/7/22 10:36
 */
public class Usage {
    public static void main(String[] args) {
        // 这段代码会抛出IllegalArgumentException，因为minIdle>maxIdle
        ResourcePoolConfig config = new ResourcePoolConfig.Builder()
                .setName("dbconnectionpool")
                .setMaxTotal(16)
                .setMaxIdle(10)
                .setMinIdle(12)
                .build();
    }
}
