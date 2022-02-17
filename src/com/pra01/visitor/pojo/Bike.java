package com.pra01.visitor.pojo;

import com.pra01.visitor.Acceptable;
import com.pra01.visitor.Visitor;

import java.time.LocalDate;

public class Bike extends Product implements Acceptable {
    public Bike(String name, float price, LocalDate productDate) {
        super(name, price, productDate);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
