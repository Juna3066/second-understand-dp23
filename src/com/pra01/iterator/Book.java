package com.pra01.iterator;

import java.util.ArrayList;
import java.util.List;

public class Book {
    class Page {
        private int index;

        public Page(int index) {
            this.index = index;
        }

        @Override
        public String toString() {
            return "Page{" + "index=" + index + '}';
        }
    }

    private List<Page> pages = new ArrayList<>();

    public Book(int size) {
        for (int i = 0; i < size; i++) {
            this.pages.add(new Page(i));
        }
    }

    public void read() {
        //硬编码 且重复 的代码 不可取
//        System.out.println(pages.get(0));
//        System.out.println(pages.get(1));
//        System.out.println(pages.get(2));
        //....
        //foreach 本质 使用Iterator遍历集合
        for (Page page : pages) {
            System.out.println(page);
        }
    }
}
