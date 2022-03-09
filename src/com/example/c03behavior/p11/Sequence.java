package com.example.c03behavior.p11;

import java.util.List;

public class Sequence implements Expression {
    //表达式序列
    private List<Expression> expressions;

    public Sequence(List<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public void interpret() {
        expressions.forEach(exp -> exp.interpret());
    }
}
