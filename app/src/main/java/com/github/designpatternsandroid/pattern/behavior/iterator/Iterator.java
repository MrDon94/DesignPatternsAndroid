package com.github.designpatternsandroid.pattern.behavior.iterator;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 迭代器接口
 * @date: 2024/8/1 11:24
 */
public interface Iterator<E> {

    boolean hasNext();

    void next();

    E currentItem();
}
