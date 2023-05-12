package com.epam.rd.autotasks.arithmeticexpressions;

public class Variable implements Expression {
    private String name;
    private int value;

    public Variable(String name, int value) {
        //implement this method
        this.name = name;
        this.value = value;
    }

    public void setValue(int value) {
        //implement this method
        this.value = value;
    }

    @Override
    public int evaluate() {
        //implement this method
        return value;
    }

    @Override
    public String toExpressionString() {
        //implement this method
        return name;
    }
}
