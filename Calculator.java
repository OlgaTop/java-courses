package com.shpp.demo;

// class makes arithmetic calculations

public final class Calculator {

    private int result;

    // The method gets the numbers and type of arithmetic action

    public void add( final char act, int first, int second) {
        if (act == '+') {
            this.result = first + second;
        } else if (act == '-') {
            this.result = first - second;
        } else if (act == '*') {
            this.result = first * second;
        } else if (act == '/') {
            if (second == 0) {
                throw new IllegalArgumentException("Error");
            }
            this.result = first / second;
        } else if (act == '^') {
            this.result = (int) Math.pow(first, second);
        }
    }
// The method returns the result of the arithmetic operation

    public int getResult() {
        return this.result;
    }

    public void clearnResult() {
        this.result = 0;
    }
}