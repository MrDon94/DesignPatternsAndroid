package com.github.designpatternsandroid.pattern.behavior.visitor;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 提取文本类
 * @date: 2024/8/2 9:10
 */
public class Extractor implements Visitor{
    @Override
    public void visit(PdfFile file) {
        //...
        System.out.println("Extract Pdf.");
    }

    @Override
    public void visit(PPTFile file) {
        //...
        System.out.println("Extract PPT.");
    }

    @Override
    public void visit(WordFile file) {
        //...
        System.out.println("Extract Word.");
    }
}
