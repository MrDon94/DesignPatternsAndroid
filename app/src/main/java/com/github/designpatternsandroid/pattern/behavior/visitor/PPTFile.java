package com.github.designpatternsandroid.pattern.behavior.visitor;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: ppt文件类
 * @date: 2024/8/2 9:08
 */
public class PPTFile extends ResourceFile{
    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
