package com.epam.rd.autotasks.arithmeticexpressions;

import java.util.StringJoiner;

public class Expressions {

    public static Variable var(String name, int value) {
        //implement this method
        return new Variable(name, value);
    }

    public static Expression val(int value) {
        //implement this method
        Expression answer = new Expression() {
            @Override
            public int evaluate() {
                return value;
            }

            @Override
            public String toExpressionString() {
                String valueS = String.valueOf(value);
                if (value<0){
                    valueS = "("+valueS+")";
                }
                return valueS;
            }
        };
        return answer;
    }
/*
* Expression sum(Expression... members) - returns an Expression holding a sum of the given members.
Consider that it is guaranteed that at least two members will be given each method call.
Consider following methods' implementation  details:

int evaluate() - returns the sum of evaluation result of all the given members.

String toExpressionString() - returns a string representation of the given sum.
Example: sum(val(1), val(2), val(3)).toExpressionString() results to (1 + 2 + 3).
 */

    public static Expression sum(Expression... members){
        //implement this method
        return new Expression() {
            @Override
            public int evaluate() {
                int sum = 0;
                for(Expression rabbit:members){
                    sum+= rabbit.evaluate();
                }
                return sum;
            }

            @Override
            public String toExpressionString() {
                String answer = "";
                for(Expression rabbit: members){
                    answer+= rabbit.toExpressionString()+" + ";
                }
                return "("+answer.substring(0,answer.length()-3)+")";
            }
        };
    }

    public static Expression product(Expression... members){
        //implement this method
        return null;
    }

    public static Expression difference(Expression minuend, Expression subtrahend){
        //implement this method
        return null;
    }

    public static Expression fraction(Expression dividend, Expression divisor){
        //implement this method
        return null;
    }

}
