package com.testing.src;

public class Calculator{

    public static int factorial(int n){
        if (n < 0)
            throw new RuntimeException("Number must be >= 0");
        if (n == 0)
            return 1;
        return n * factorial(n-1);
    }

    public static int combination(int n, int r){
        if (r > n)
            throw new RuntimeException("R cannot be larger than n");
        return factorial(n)/ (factorial(n-r) * factorial(r));
    }
}