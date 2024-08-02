package com.github.designpatternsandroid.pattern.behavior.visitor.dispatch;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 单分派演示
 * 单分派：动态确定执行哪个对象，静态确定执行哪个方法。
 * 双分派：动态确定执行哪个对象的哪个方法。
 * @date: 2024/8/2 11:03
 */
public class Usage {
    public static void main(String[] args) {
        SingleDispatchClass demo = new SingleDispatchClass();
        ParentClass p = new ChildClass();
        demo.polymorphismFunction(p);//执行哪个对象的方法，由对象的实际类型决定
        demo.overloadFunction(p);//执行对象的哪个方法，由参数对象的声明类型决定

        //代码执行结果:
        //I am ChildClass's f().
        //I am overloadFunction(ParentClass p).

//        Extractor extractor = new Extractor();
//        List<ResourceFile> resourceFiles = listAllResourceFiles(args[0]);
//        for (ResourceFile resourceFile : resourceFiles) {
//            extractor.extract2txt(resourceFile); 如果是双分派，这里就不会编译报错，就会在运行是动态确定执行哪个对象的哪个方法
//        }
    }
}
