package com.cbfacademy.operators;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int number1 = 12;
        int number2 = 12;

        System.out.println(number1++); // 12
        System.out.println(++number2); //13 
    }

    public static double add(double operand1, double operand2) {
        double addition = operand1 + operand2;
        System.out.println(addition);
        return addition;
    }

    public static double subtract(double operand1, double operand2) {
       double subtraction = operand1 - operand2;
       System.out.println(subtraction);
       return subtraction;
    }

    public static double multiply(double operand1, double operand2) {
        double multiplication = operand1 * operand2;
        System.out.println(multiplication);
        return multiplication;
    }

    public static Boolean areEqual(double operand1, double operand2) {
        boolean equal = operand1 == operand2;
        return equal;
    }

    public static Boolean isLessThan(double operand1, double operand2) {
        boolean lessThan = operand1 <= operand2;
        return lessThan;
    }

    public static Boolean isMoreThan(double operand1, double operand2) {
        boolean moreThan = operand1 >= operand2;
        return moreThan;
    }
}

