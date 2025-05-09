package com.example;

public class Division {
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Tegeer huwaah bolomjgui");
        }
        return a / b;
    }
}
