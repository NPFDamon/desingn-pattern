package com.cn.iterator;

import java.util.ArrayList;
import java.util.List;

public class NumberContainer implements Container {
    private final int[] num;

    public NumberContainer(int[] num) {
        this.num = num;
    }

    @Override
    public Iterator getIterator() {
        return new NumberIterator();
    }

    private class NumberIterator implements Iterator {
        int index;

        @Override
        public boolean haveNext() {
            return index < num.length;
        }

        @Override
        public Object next() {
            if (this.haveNext()) {
                return num[index++];
            }
            return null;
        }

        @Override
        public Object rule() {
            List<Integer> list = new ArrayList<>();
            for (int value : num) {
                if (value % 2 == 0) {
                    list.add(value);
                }
            }
            return list;
        }
    }
}
