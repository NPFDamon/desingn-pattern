package com.cn.iterator;

/**
 * 迭代器模式；顺序的访问集合对象中的元素，不需要知道集合的底层展示
 * 提供一种方法顺序访问一个聚合对象中各元素，无需暴露该对象的内部展示
 */
public class Test {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        NumberContainer numberContainer = new NumberContainer(num);
        Iterator iterator = numberContainer.getIterator();
        while (iterator.haveNext()) {
            System.out.print(iterator.next() + ",");
        }
        System.out.println("\n");
        System.out.println(iterator.rule());

    }
}
