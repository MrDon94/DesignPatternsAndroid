package com.github.designpatternsandroid.pattern.behavior.visitor;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 资源抽象类
 * @date: 2024/8/2 9:07
 */
public abstract class ResourceFile {
    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    abstract public void accept(Visitor visitor);
}
