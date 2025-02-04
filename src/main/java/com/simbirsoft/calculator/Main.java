package com.simbirsoft.calculator;

import com.simbirsoft.calculator.core.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator testCalc = new Calculator();
        System.out.println(testCalc.executeOperation(2, "+", 3));
        System.out.println(testCalc.executeOperation(2, "-", 3));
        try {
            System.out.println(testCalc.executeOperation(2, "/", 0));
            System.out.println(testCalc.executeOperation(8, "sqrt", 2));
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль невозможно");
        }
    }
}
