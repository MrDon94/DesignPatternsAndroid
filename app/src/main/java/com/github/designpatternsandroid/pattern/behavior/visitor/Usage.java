package com.github.designpatternsandroid.pattern.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 访问者模式用法
 * 访问者模式：允许一个或者多个操作应用到一组对象上，解耦操作和对象本身。
 * 解释：访问者模式针对的是一组类型不同的对象（PdfFile、PPTFile、WordFile）。不过，尽管这组对象的类型是不同的，但
 * 是，它们继承相同的父类（ResourceFile）或者实现相同的接口。在不同的应用场景下，我们需要对这组对象进行一系列不相关
 * 的业务操作（抽取文本、压缩等），但为了避免不断添加功能导致类（PdfFile、PPTFile、WordFile）不断膨胀，职责越来越
 * 不单一，以及避免频繁地添加功能导致的频繁代码修改，我们使用访问者模式，将对象与操作解耦，将这些业务操作抽离出来，定
 * 义在独立细分的访问者类（Extractor、Compressor）中。
 * @date: 2024/8/2 9:12
 */
public class Usage {
    public static void main(String[] args) {
        Extractor extractor = new Extractor();
        List<ResourceFile> resourceFiles = listAllResourceFiles(args[0]);
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.accept(extractor);
        }

        Compressor compressor = new Compressor();
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.accept(compressor);
        }
    }

    private static List<ResourceFile> listAllResourceFiles(String resourceDirectory){
        List<ResourceFile> resourceFiles = new ArrayList<>();
        //...根据后缀(pdf/ppt/word)由工厂方法创建不同的类对象(PdfFile/PPTFile/WordFile)
        resourceFiles.add(new PdfFile("a.pdf"));
        resourceFiles.add(new WordFile("b.doc"));
        resourceFiles.add(new PPTFile("c.ppt"));
        return resourceFiles;
    }
}
