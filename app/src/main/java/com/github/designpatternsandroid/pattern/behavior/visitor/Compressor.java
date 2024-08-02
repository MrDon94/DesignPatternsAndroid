package com.github.designpatternsandroid.pattern.behavior.visitor;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 压缩操作类
 * @date: 2024/8/2 9:10
 */
public class Compressor implements Visitor{
    @Override
    public void visit(PdfFile file) {
        //...
        System.out.println("Compress Pdf.");
    }

    @Override
    public void visit(PPTFile file) {
        //...
        System.out.println("Compress PPT.");
    }

    @Override
    public void visit(WordFile file) {
        //...
        System.out.println("Compress Word.");
    }
}
