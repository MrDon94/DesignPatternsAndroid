package com.github.designpatternsandroid;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description:
 * @date: 2024/8/1 13:47
 */
public class CdTest {

    @Test
    public void test(){
        List<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        Iterator<String> iterator = names.iterator();
        Iterator<String> iterator2 = names.iterator();

        iterator.next();
        iterator.remove();
        iterator2.next();
    }
}
