package com.example.c03behavior.p02;

/**
 * 也可以使用 java 工具包 util的 自带 Iterator 接口
 *
 * @param <E>
 */
public interface Iterator<E> {
    E next();

    boolean hasNext();
}
