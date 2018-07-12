package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) throws IllegalArgumentException {
        if (i < 0) throw new IllegalArgumentException("i is less than 0");
        int factorial = 1;
        for (int num = 1; num <= i; num++) {
            factorial *= num;
        }
        return factorial;
    }
}
