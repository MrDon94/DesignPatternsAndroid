package com.github.designpatternsandroid.pattern.behavior.visitor;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: word文件类
 * @date: 2024/8/2 9:08
 */
public class WordFile extends ResourceFile{
    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
