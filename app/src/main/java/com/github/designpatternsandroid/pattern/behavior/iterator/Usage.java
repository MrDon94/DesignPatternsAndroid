package com.github.designpatternsandroid.pattern.behavior.iterator;


/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 迭代器模式用法
 * 迭代器模式：也叫游标模式。它用来遍历集合对象。这里说的“集合对象”，我们也可以叫“容器”“聚合对象”，实际上就是包含一组
 * 对象的对象，比如，数组、链表、树、图、跳表。
 *
 * 一个完整的迭代器模式，一般会涉及容器和容器迭代器两部分内容。为了达到基于接口而非实现编程的目的，容器又包含容器接口、
 * 容器实现类，迭代器又包含迭代器接口、迭代器实现类。容器中需要定义 iterator() 方法，用来创建迭代器。迭代器接口中需
 * 要定义 hasNext()、currentItem()、next() 三个最基本的方法。容器对象通过依赖注入传递到迭代器类中。
 * @date: 2024/8/1 11:26
 */
public class Usage {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("xzg");
        names.add("wang");
        names.add("zheng");

        /*Iterator<String> iterator = new ArrayIterator(names);
        while (iterator.hasNext()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }*/

        //为了封装迭代器的创建细节，在容器中定义一个 iterator() 方法，来创建对应的迭代器。
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
