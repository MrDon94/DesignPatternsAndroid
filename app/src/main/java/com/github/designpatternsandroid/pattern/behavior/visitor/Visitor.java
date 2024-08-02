package com.github.designpatternsandroid.pattern.behavior.visitor;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 访问者接口
 * @date: 2024/8/2 9:08
 */
public interface Visitor {
    void visit(PdfFile file);
    void visit(PPTFile file);
    void visit(WordFile file);
}
