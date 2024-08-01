package com.github.designpatternsandroid.pattern.behavior.iterator;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description:
 * @date: 2024/8/1 11:35
 */
public class ArrayList<E> implements List<E> {
    @Override
    public Iterator iterator() {
        return new ArrayIterator(this);
    }

    public int size(){
        return 0;
    }

    public E get(int index){
        return null;
    }

    public void add(E item){

    }
}
