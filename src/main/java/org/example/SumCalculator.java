package org.example;

public class SumCalculator {
    int sum (int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("The number must be positive and greater than 0");
        }
        return n * (n + 1) / 2;
    }
}