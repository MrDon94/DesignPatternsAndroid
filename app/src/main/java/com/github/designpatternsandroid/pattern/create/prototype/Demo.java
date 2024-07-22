package com.github.designpatternsandroid.pattern.create.prototype;

import java.util.HashMap;
import java.util.List;

/**
 * @author: cd
 * @projectName: DesignPatternsAndroid
 * @description: 原型模式
 * 什么是原型模式？
 * 如果对象的创建成本比较大，而同一个类的不同对象之间差别不大（大部分字段都相同），在这种情况下，我们可以利用对已有对
 * 象（原型）进行复制（或者叫拷贝）的方式，来创建新对象，以达到节省创建时间的目的。这种基于原型来创建对象的方式就叫作
 * 原型设计模式，简称原型模式。
 *
 * 原型模式的两种实现方法：深拷贝和浅拷贝
 * 浅拷贝只会复制对象中基本数据类型数据和引用对象的内存地址，不会递归地复制引用对象，以及引用对象的引用对象……而深拷贝
 * 得到的是一份完完全全独立的对象。所以，深拷贝比起浅拷贝来说，更加耗时，更加耗内存空间。
 * @date: 2024/7/22 14:01
 */
public class Demo {
    private HashMap<String, SearchWord> currentKeywords=new HashMap<>();
    private long lastUpdateTime = -1;

    public void refresh() {
        //浅拷贝和深拷贝结合的这种方式即利用了浅拷贝节省时间、空间的优点，又能保证 currentKeywords 中的中数据都是老版本的数据。
        //1.浅拷贝
        HashMap<String, SearchWord> newKeywords = (HashMap<String, SearchWord>) currentKeywords.clone();

        // 从数据库中取出更新时间>lastUpdateTime的数据，放入到newKeywords中
        List<SearchWord> toBeUpdatedSearchWords = getSearchWords(lastUpdateTime);
        long maxNewUpdatedTime = lastUpdateTime;
        for (SearchWord searchWord : toBeUpdatedSearchWords) {
            if (searchWord.getLastUpdateTime() > maxNewUpdatedTime) {
                maxNewUpdatedTime = searchWord.getLastUpdateTime();
            }
            //2.对于需要更新的 SearchWord 对象，使用深度拷贝的方式创建一份新的对象，替换 newKeywords 中的老对象
            if (newKeywords.containsKey(searchWord.getKeyword())) {
                newKeywords.remove(searchWord.getKeyword());
            }
            newKeywords.put(searchWord.getKeyword(), searchWord);
        }

        lastUpdateTime = maxNewUpdatedTime;
        currentKeywords = newKeywords;
    }

    private List<SearchWord> getSearchWords(long lastUpdateTime) {
        // TODO: 从数据库中取出更新时间>lastUpdateTime的数据
        return null;
    }

    private static class SearchWord{
        private long lastUpdateTime;
        private String keyword;

        public long getLastUpdateTime() {
            return lastUpdateTime;
        }

        public void setLastUpdateTime(long lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
        }

        public String getKeyword() {
            return keyword;
        }

        public void setKeyword(String keyword) {
            this.keyword = keyword;
        }
    }
}
