package com.pra01.visitor;


import com.pra01.visitor.pojo.Bike;
import com.pra01.visitor.pojo.Fruit;
import com.pra01.visitor.pojo.Wine;

/**
 * 访问者关键之一 访问方法重载 解决了 instanceof 判单商品类别多if else 问题
 */
public interface Visitor {
    void visit(Bike bike);

    void visit(Fruit fruit);

    void visit(Wine wine);
}
