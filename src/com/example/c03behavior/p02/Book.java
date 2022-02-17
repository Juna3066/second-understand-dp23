package com.example.c03behavior.p02;

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
            return "Page{" +
                    "index=" + index +
                    '}';
        }
    }

    private List<Page> pages = new ArrayList<>();

    public Book(int size) {
        for (int i = 0; i < size; i++) {
            pages.add(new Page(i + 1));
        }
    }

    public void read() {
//        System.out.println(pages.get(0));
//        System.out.println(pages.get(1));
//        System.out.println(pages.get(2));
//        System.out.println(pages.get(3));
//        System.out.println(pages.get(4));
//        System.out.println(pages.get(5));
        //重复且硬编码的重复方式绝对不可取...

        for (Page page : pages) {
            System.out.println(page);
        }
    }
}
